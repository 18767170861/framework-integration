package org.wmc.mall.service;

import java.util.List;
import org.wmc.mall.form.CartAddForm;
import org.wmc.mall.form.CartUpdateForm;
import org.wmc.mall.pojo.Cart;
import org.wmc.mall.vo.CartVo;
import org.wmc.mall.vo.ResponseVo;

public interface ICartService {

	ResponseVo<CartVo> add(Integer uid, CartAddForm form);

	ResponseVo<CartVo> list(Integer uid);

	ResponseVo<CartVo> update(Integer uid, Integer productId, CartUpdateForm form);

	ResponseVo<CartVo> delete(Integer uid, Integer productId);

	ResponseVo<CartVo> selectAll(Integer uid);

	ResponseVo<CartVo> unSelectAll(Integer uid);

	ResponseVo<Integer> sum(Integer uid);

	List<Cart> listForCart(Integer uid);
}
