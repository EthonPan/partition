/**
 * 〈一句话功能简述〉<br>
 * 〈分类代码〉
 *
 * @author Algorithm
 * @since 1.0.0
 */
package com.limitation.enums;

import lombok.Getter;

/**
 *
 */
public enum PartitionEnum {


    ONE_DIMENSIONAL("one dimensional","一维组合算法"),
    ONE_DIMENSIONAL_INTERVAL("one dimensional interval","一维组合区间算法");

    @Getter
    private String code;

    @Getter
    private String desc;

    PartitionEnum(String code,String desc) {
        this.code = code;
        this.desc = desc;
    }



}
