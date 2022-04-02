package org.wmc.mall.service;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.wmc.mall.MallApplicationTests;
import org.wmc.mall.enums.ResponseEnum;
import org.wmc.mall.form.CartAddForm;
import org.wmc.mall.vo.CartVo;
import org.wmc.mall.vo.OrderVo;
import org.wmc.mall.vo.ResponseVo;

@Slf4j
//@Transactional
public class IOrderServiceTest extends MallApplicationTests {

	@Autowired
	private IOrderService orderService;

	@Autowired
	private ICartService cartService;

	private Integer uid = 1;

	private Integer shippingId = 4;

	private Integer productId = 26;

	private Gson gson = new GsonBuilder().setPrettyPrinting().create();

	@Before
	public void before() {
		CartAddForm form = new CartAddForm();
		form.setProductId(productId);
		form.setSelected(true);
		ResponseVo<CartVo> responseVo = cartService.add(uid, form);
		Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
	}

	@Test
	public void createTest() {
		ResponseVo<OrderVo> responseVo = create();
		Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
	}

	private ResponseVo<OrderVo> create() {
		ResponseVo<OrderVo> responseVo = orderService.create(uid, shippingId);
		log.info("result={}", gson.toJson(responseVo));
		return responseVo;
	}

	@Test
	public void list() {
		ResponseVo<PageInfo> responseVo = orderService.list(uid, 1, 4);
		log.info("result={}", gson.toJson(responseVo));
		Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
	}

	@Test
	public void detail() {
		ResponseVo<OrderVo> vo = create();
		ResponseVo<OrderVo> responseVo = orderService.detail(uid, vo.getData().getOrderNo());
		log.info("result={}", gson.toJson(responseVo));
		Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
	}

	@Test
	public void cancel() {
		ResponseVo<OrderVo> vo = create();
		ResponseVo responseVo = orderService.cancel(uid, vo.getData().getOrderNo());
		log.info("result={}", gson.toJson(responseVo));
		Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
	}
}