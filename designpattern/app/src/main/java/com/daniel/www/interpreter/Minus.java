package com.daniel.www.interpreter;

/**
 * desc:Minus
 * Author: Daniel
 * Date: 2017-01-09 17:49
 */
public class Minus implements Expression {

    @Override
    public int interpret(Contexts context) {
        return context.getNum1()-context.getNum2();
    }
}
