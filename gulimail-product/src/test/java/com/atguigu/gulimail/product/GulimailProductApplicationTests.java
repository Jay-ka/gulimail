package com.atguigu.gulimail.product;

import com.atguigu.gulimail.product.domain.Attr;
import com.atguigu.gulimail.product.mapper.AttrMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimailProductApplicationTests {
    @Autowired
    private AttrMapper attrMapper;

    @Test
    void generate() {
        List<Attr> attrs = attrMapper.selectList(null);
        System.out.println(attrs);
    }
}
