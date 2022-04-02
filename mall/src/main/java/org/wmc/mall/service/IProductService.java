package org.wmc.mall.service;

import com.github.pagehelper.PageInfo;
import org.wmc.mall.vo.ProductDetailVo;
import org.wmc.mall.vo.ResponseVo;

public interface IProductService {

	ResponseVo<PageInfo> list(Integer categoryId, Integer pageNum, Integer pageSize);

	ResponseVo<ProductDetailVo> detail(Integer productId);
}
