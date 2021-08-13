/**
 * Copyright (C), 2015-2021, --XXX有限公司
 * FileName: SimpleLimitationServiceImpl
 * Author:   Algorithm
 * Description: 一维最值算法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名:Algorithm 修改时间           版本号              描述
 */
package com.limitation.service.impl;

import com.limitation.bo.SimpleLimitationBO;
import com.limitation.model.SequenceBean;
import com.limitation.vo.SimpleLimitationVO;

import java.util.ArrayList;
import java.util.List;

public class SimpleLimitationServiceImpl {


    /**
     * 一维最值算法(组合极限)
     * @return
     */
    public SimpleLimitationVO exportSingle(SimpleLimitationBO bo){

        //待分割长度
        int length = bo.getLength();

        //优化公差
        int tolerance = bo.getTolerance();

        //组合长度列表
        Integer[] items = bo.getItems();

        //宽度种类数量
        int indexList = items.length;


        boolean[][] f = new boolean[indexList+1][length+1];

        f[0][0] = true;
        for (int i = 1; i < length; i++) {
            f[0][i] = false;
        }

        //依次放零件
        for (int i = 1; i <= indexList; i++) {
            //
            for (int j = 0; j <= length ; j++) {
                //继承之前一组数据状态（）
                f[i][j] = f[i-1][j];
                //j>=零件长度
                if(j>=items[i-1]){
                    f[i][j] = f[i][j] || f[i-1][j-items[i-1]]; //继承之前状态（f[i][j]），本零件符合要求或本零件与之前组合状态符合要求（f[i-1][j-items[i-1]]）
                }
            }

        }

        //找出最大利用率的矩阵行
        //最大利用率行，放入的零件下标maxIndex
        Integer maxIndex = null;
        //原料使用长度
        Integer maxLength = null;

        List<SequenceBean> beanList = new ArrayList<>();


        for (int j = length; j >=0 ; j--) {
            for (int i = 0; i < indexList; i++) {
                if(f[i][j]){
                    maxIndex=i;
                    maxLength=j;
                    SequenceBean sequenceBean = new SequenceBean();
                    sequenceBean.setIndex(i);
                    sequenceBean.setLength(j);
                    beanList.add(sequenceBean);
                    //超出最大公差
                    if(j<length-tolerance){
                        break;
                    }
                }
            }
        }
        //一个都不能放入
        if(maxIndex==null){
            throw new RuntimeException("分割长度超出原长度");
        }



        return null;
    }
}
