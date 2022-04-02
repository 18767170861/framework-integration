package org.wmc.mall.service;

import java.util.List;
import java.util.Set;
import org.wmc.mall.vo.CategoryVo;
import org.wmc.mall.vo.ResponseVo;

public interface ICategoryService {

	ResponseVo<List<CategoryVo>> selectAll();

	void findSubCategoryId(Integer id, Set<Integer> resultSet);
}
