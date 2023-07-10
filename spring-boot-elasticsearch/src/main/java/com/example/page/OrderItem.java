package com.example.page;

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
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 6741658659234385246L;

    /**
     * 需要进行排序的字段
     */
    private String column;

    /**
     * 是否升序排列，默认为true
     */
    private boolean asc = true;
}
