package com.example.page;

import com.example.enums.QueryType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author liupan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryItem implements Serializable {
    private static final long serialVersionUID = 5197461985362935426L;

    /**
     * 查询类型
     */
    private String queryType = QueryType.regexp.name();

    /**
     * 查询列名
     */
    private String column;

    /**
     * 查询值
     */
    private String value;
}
