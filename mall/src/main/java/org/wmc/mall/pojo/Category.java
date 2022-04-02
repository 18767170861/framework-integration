package org.wmc.mall.pojo;

import java.util.Date;
import lombok.Data;

/**
 * 类 {@code Category} 商品类别.
 *
 * <p>`mall`.`mail_category`表结构对应实体对象.
 *
 * @author wmc
 * @since 2022/02/09
 */
@Data
public class Category {

  private Integer id;

  private Integer parentId;

  private String name;

  private Integer status;

  private Integer sortOrder;

  private Date createTime;

  private Date updateTime;

}
