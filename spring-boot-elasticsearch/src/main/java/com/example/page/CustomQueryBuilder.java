package com.example.page;

import com.example.enums.QueryType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liupan
 */
public class CustomQueryBuilder {
    public static List<QueryBuilder> genQueryBuilder(List<QueryItem> queryItemList) {
        List<QueryBuilder> queryBuilderList = new ArrayList<>(queryItemList.size());

        for (QueryItem queryItem : queryItemList) {
            String queryType = queryItem.getQueryType();
            // 正则表达式
            if (QueryType.regexp.name().equals(queryType)) {
                queryBuilderList.add(QueryBuilders.regexpQuery(queryItem.getColumn(), queryItem.getValue()));
            }
        }
        return queryBuilderList;
    }
}
