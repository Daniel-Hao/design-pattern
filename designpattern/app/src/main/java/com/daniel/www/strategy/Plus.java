package com.daniel.www.strategy;

/**
 * desc:Plus
 * Author: Daniel
 * Date: 2017-01-09 14:00
 */
public class Plus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
