/**
 * Copyright (C), 2015-2021, --XXX有限公司
 * FileName: DemarcationSeriviceImpl
 * Author:   Algorithm
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名:Algorithm 修改时间           版本号              描述
 */
package com.limitation.service.impl;

import com.limitation.ann.Demarcation;
import com.limitation.bean.bo.PartitionBO;
import com.limitation.bean.vo.PartitionVO;
import com.limitation.bo.SimpleLimitationBO;
import com.limitation.service.DemarcationSerivice;

@Demarcation
public class DemarcationSeriviceImpl implements DemarcationSerivice {

    @Override
    public PartitionVO algorithmPartition(PartitionBO partitionBO) {


        SimpleLimitationBO bo = new SimpleLimitationBO();

        new SimpleLimitationServiceImpl().exportSingle(bo);



        return null;
    }



}
