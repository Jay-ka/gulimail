package com.atguigu.gulimail.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimail.product.domain.Brand;
import com.atguigu.gulimail.product.service.BrandService;
import com.atguigu.gulimail.product.mapper.BrandMapper;
import org.springframework.stereotype.Service;

/**
* @author manor
* @description 针对表【pms_brand(品牌)】的数据库操作Service实现
* @createDate 2022-03-14 09:48:24
*/
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand>
    implements BrandService{

}




