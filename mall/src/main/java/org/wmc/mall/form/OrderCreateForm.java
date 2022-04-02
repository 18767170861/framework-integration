package org.wmc.mall.form;

import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OrderCreateForm {

	@NotNull
	private Integer shippingId;
}
