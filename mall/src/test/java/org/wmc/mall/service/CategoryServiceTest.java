package org.wmc.mall.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.wmc.mall.MallApplicationTests;
import org.wmc.mall.enums.ResponseEnum;
import org.wmc.mall.vo.CategoryVo;
import org.wmc.mall.vo.ResponseVo;

@Slf4j
public class CategoryServiceTest extends MallApplicationTests {

	@Autowired
	private ICategoryService categoryService;

	@Test
	public void selectAll() {
		ResponseVo<List<CategoryVo>> responseVo = categoryService.selectAll();
		Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
	}

	@Test
	public void findSubCategoryId() {
		Set<Integer> set = new HashSet<>();
		categoryService.findSubCategoryId(100001, set);
		log.info("set={}", set);
	}
}