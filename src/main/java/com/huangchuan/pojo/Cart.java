package com.huangchuan.pojo;

import lombok.*;

import java.util.Date;

//@Data //包括get,set,equals,hashcode,toString等方法，equals,hashcode默认所有属性
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString
public class Cart {
    private Integer id;

    private Integer userId;

    private Integer productId;

    private Integer quantity;

    private Integer checked;

    private Date createTime;

    private Date updateTime;

}