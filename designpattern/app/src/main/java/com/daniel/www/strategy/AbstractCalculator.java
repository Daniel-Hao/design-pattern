package com.daniel.www.strategy;

/**
 * desc:AbstractCalculator
 * Author: Daniel
 * Date: 2017-01-09 14:00
 *
 * 辅助类
 */
public abstract class AbstractCalculator {

    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
