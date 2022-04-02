package org.wmc.mall.form;

import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 添加商品
 */
@Data
public class CartAddForm {

	@NotNull
	private Integer productId;

	private Boolean selected = true;
}
