package com.huangchuan.service;

import com.github.pagehelper.PageInfo;
import com.huangchuan.common.ServerResponse;
import com.huangchuan.pojo.Shipping;

/**
 * Created by hc on 2018/6/4.
 */
public interface IShippingService {

    ServerResponse add(Integer userId, Shipping shipping);

    ServerResponse<String> del(Integer userId,Integer shippingId);

    ServerResponse update(Integer userId, Shipping shipping);

    ServerResponse<Shipping> select(Integer userId, Integer shippingId);

    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);
}
