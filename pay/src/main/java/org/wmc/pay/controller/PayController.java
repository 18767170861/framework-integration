package org.wmc.pay.controller;

import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.wmc.pay.pojo.PayInfo;
import org.wmc.pay.service.impl.PayServiceImpl;

@Controller
@RequestMapping("/pay")
@Slf4j
public class PayController {

	@Autowired
	private PayServiceImpl payService;

	@Autowired
	private WxPayConfig wxPayConfig;

	/**
	 * 创建/发起支付
	 * @param orderId
	 * @param orderName
	 * @param amount
	 * @param bestPayTypeEnum
	 * @return
	 */
	@GetMapping("/create")
	public ModelAndView create(@RequestParam("orderId") String orderId,
			@RequestParam("orderName") String orderName,
			@RequestParam("amount") BigDecimal amount,
			@RequestParam("payType") BestPayTypeEnum bestPayTypeEnum
	) {
		PayResponse response = payService.create(orderId, orderName, amount, bestPayTypeEnum);

		//支付方式不同，渲染就不同, WXPAY_NATIVE使用codeUrl（一个支付地址）,  ALIPAY_PC使用body（一个表单信息）
		Map<String, String> map = new HashMap<>();
		if (bestPayTypeEnum == BestPayTypeEnum.WXPAY_NATIVE) {
			map.put("codeUrl", response.getCodeUrl());
			map.put("orderId", orderId);
			map.put("returnUrl", wxPayConfig.getReturnUrl());
			return new ModelAndView("createForWxNative", map);
		}else if (bestPayTypeEnum == BestPayTypeEnum.ALIPAY_PC) {
			map.put("body", response.getBody());
			return new ModelAndView("createForAlipayPc", map);
		}
		throw new RuntimeException("暂不支持的支付类型");
	}

	/**
	 * 异步通知处理
	 * @param notifyData
	 * @return
	 */
	@PostMapping("/notify")
	@ResponseBody
	public String asyncNotify(@RequestBody String notifyData) {
		return payService.asyncNotify(notifyData);
	}

	/**
	 * 微信支付记录（通过订单号）
	 * @param orderId
	 * @return
	 */
	@GetMapping("/queryByOrderId")
	@ResponseBody
	public PayInfo queryByOrderId(@RequestParam String orderId) {
		log.info("查询支付记录...");
		return payService.queryByOrderId(orderId);
	}
}
