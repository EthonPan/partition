/**
 * Copyright (C), 2015-2021, --XXX有限公司
 * FileName: SequenceBean
 * Author:   Algorithm
 * Description: 组合数组序列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名:Algorithm 修改时间           版本号              描述
 */
package com.limitation.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class SequenceBean implements Serializable{

    private static final long serialVersionUID = 8274754887848317966L;

    private int index;

    private int length;
}
