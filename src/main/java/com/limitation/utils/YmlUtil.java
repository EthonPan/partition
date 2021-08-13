/**
 * Copyright (C), 2015-2021, --XXX有限公司
 * FileName: YmlUtil
 * Author:   Algorithm
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名:Algorithm 修改时间           版本号              描述
 */
package com.limitation.utils;

import cn.hutool.core.io.resource.ClassPathResource;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class YmlUtil {

    private static YmlUtil instance = new YmlUtil();

    private YmlUtil(){
        ClassPathResource resource = new ClassPathResource("application.yml");
        Yaml yaml = new Yaml();
        Map ymlData = yaml.loadAs(resource.getStream(), Map.class);
        System.out.println(ymlData);
    }

    public static YmlUtil getInstance(){

        return instance;
    }


    public static void main(String[] args){
        YmlUtil.getInstance();
    }

}
