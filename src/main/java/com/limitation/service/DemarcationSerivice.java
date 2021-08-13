/**
 * 〈一句话功能简述〉<br>
 * 〈分界接口〉
 *
 * @author Algorithm
 * @since 1.0.0
 */
package com.limitation.service;

import com.limitation.bean.bo.PartitionBO;
import com.limitation.bean.vo.PartitionVO;

/**
 * 分解运行接口
 */
public interface DemarcationSerivice {

    PartitionVO algorithmPartition(PartitionBO partitionBO);
}
