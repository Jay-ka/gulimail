package com.atguigu.gulimail.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimail.product.domain.Category;
import com.atguigu.gulimail.product.service.CategoryService;
import com.atguigu.gulimail.product.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author manor
* @description 针对表【pms_category(商品三级分类)】的数据库操作Service实现
* @createDate 2022-03-14 09:48:24
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




