package com.daniel.www.interpreter;

/**
 * desc:Plus
 * Author: Daniel
 * Date: 2017-01-09 17:56
 */
public class Plus implements Expression {

    @Override
    public int interpret(Contexts context) {
        return context.getNum1()+context.getNum2();
    }
}
