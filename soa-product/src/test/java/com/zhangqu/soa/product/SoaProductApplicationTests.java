package com.zhangqu.soa.product;

import com.zhangqu.soa.product.entity.BrandEntity;
import com.zhangqu.soa.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SoaProductApplicationTests {

    @Autowired
    BrandService brandService;


    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }



}
