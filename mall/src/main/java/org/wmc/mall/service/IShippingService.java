package org.wmc.mall.service;

import com.github.pagehelper.PageInfo;

import java.util.Map;
import org.wmc.mall.form.ShippingForm;
import org.wmc.mall.vo.ResponseVo;

public interface IShippingService {

	ResponseVo<Map<String, Integer>> add(Integer uid, ShippingForm form);

	ResponseVo delete(Integer uid, Integer shippingId);

	ResponseVo update(Integer uid, Integer shippingId, ShippingForm form);

	ResponseVo<PageInfo> list(Integer uid, Integer pageNum, Integer pageSize);
}
