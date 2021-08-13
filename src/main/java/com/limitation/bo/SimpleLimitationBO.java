/**
 * Copyright (C), 2015-2021, --XXX有限公司
 * FileName: SimpleLimitationBO
 * Author:   Algorithm
 * Description: 一维最值组合算法参数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名:Algorithm 修改时间           版本号              描述
 */
package com.limitation.bo;

import lombok.Data;

import java.io.Serializable;

@Data
public class SimpleLimitationBO implements Serializable{
    private static final long serialVersionUID = -2189484269442883582L;

    /**
     * 待分割长度
     */
    private int length;

    /**
     * 组合长度列表
     */
    private Integer[] items;

    /**
     * 优化公差
     */
    private int tolerance;

}
