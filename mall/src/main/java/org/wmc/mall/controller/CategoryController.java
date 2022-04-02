package org.wmc.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.wmc.mall.service.ICategoryService;
import org.wmc.mall.vo.CategoryVo;
import org.wmc.mall.vo.ResponseVo;

@RestController
public class CategoryController {

	@Autowired
	private ICategoryService categoryService;

	@GetMapping("/categories")
	public ResponseVo<List<CategoryVo>> selectAll() {
		return categoryService.selectAll();
	}
}
