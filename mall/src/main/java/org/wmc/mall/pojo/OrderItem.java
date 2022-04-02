package org.wmc.mall.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 类 {@code OrderItem} 订单.
 *
 * <p>`mall`.`mail_order_item`表结构对应实体对象.
 *
 * @author wmc
 * @since 2022/02/09
 */
@Data
public class OrderItem {

    private Integer id;

    private Integer userId;

    private Long orderNo;

    private Integer productId;

    private String productName;

    private String productImage;

    private BigDecimal currentUnitPrice;

    private Integer quantity;

    private BigDecimal totalPrice;

    private Date createTime;

    private Date updateTime;

}