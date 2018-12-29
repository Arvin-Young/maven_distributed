package com.itcodai.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TOrder {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private Double price;

    /**
     * 所存的数据库
     */
    private String dbSource;
}
