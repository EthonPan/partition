/**
 * 〈一句话功能简述〉<br>
 * 〈实例入口〉
 *
 * @author Algorithm
 * @since 1.0.0
 */
package com.limitation.entry;

import com.limitation.bean.bo.PartitionBO;
import com.limitation.bean.vo.PartitionVO;
import com.limitation.proxy.AlgorithmProxy;
import com.limitation.service.impl.DemarcationSeriviceImpl;

public enum PartitionEntry{


    INSTANCE;


    public PartitionVO doMainEntry(PartitionBO bo){

        AlgorithmProxy algorithm = new AlgorithmProxy();


        return algorithm.getInstance(new DemarcationSeriviceImpl()).algorithmPartition(bo);
    }
}
