/**
 * Copyright (C), 2015-2021, --XXX有限公司
 * FileName: AlgorithmProxy
 * Author:   Algorithm
 * Description: 运算代理
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名:Algorithm 修改时间           版本号              描述
 */
package com.limitation.proxy;

import com.limitation.service.DemarcationSerivice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 算法代理
 */
public class AlgorithmProxy implements InvocationHandler {

    private DemarcationSerivice demarcationSerivice;

    public DemarcationSerivice getInstance(DemarcationSerivice demarcationSerivice){
        this.demarcationSerivice = demarcationSerivice;
        Class<?> clazz = demarcationSerivice.getClass();
        return (DemarcationSerivice) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(demarcationSerivice,args);

        return result;
    }




}
