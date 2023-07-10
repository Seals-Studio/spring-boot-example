package com.example.page;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author liupan
 */
@Data
public class QueryCondition implements Serializable {
    private static final long serialVersionUID = 5169999066691123129L;

    /**
     * 查询条件
     */
    private List<QueryItem> conditions;

    /**
     * 排序
     */
    private List<OrderItem> orders;

    /**
     * 当前记录起始索引
     */
    private Integer pageNum;

    /**
     * 每页显示记录数
     */
    private Integer pageSize;
}
