package com.huangchuan.service;

import com.huangchuan.common.ServerResponse;
import com.huangchuan.pojo.Category;

import java.util.List;

/**
 * Created by hc on 2018/5/31.
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId,String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}
