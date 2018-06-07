package com.huangchuan.service.test;

import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.huangchuan.common.ServerResponse;
import com.huangchuan.service.IProductService;
import com.huangchuan.test.TestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by geely
 */
public class ProductServiceTest extends TestBase {

    @Autowired
    private IProductService iProductService;

    @Test
    public void testIProductService(){
        ServerResponse<PageInfo> result =  iProductService.getProductByKeywordCategory("iphone",2,1,5,"price_desc");
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<String> images = Lists.newArrayList();
        images.add("huangchuan/aa.jpg");
        images.add("huangchuan/bb.jpg");
        images.add("huangchuan/cc.jpg");
        images.add("huangchuan/dd.jpg");
        images.add("huangchuan/ee.jpg");
//        ["huangchuan/aa.jpg","huangchuan/bb.jpg","huangchuan/cc.jpg","huangchuan/dd.jpg","huangchuan/ee.jpg"]
    }
}
