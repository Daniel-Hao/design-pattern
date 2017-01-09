package com.daniel.www.interpreter;

/**
 * desc:Expression
 * Author: Daniel
 * Date: 2017-01-09 17:49
 *
 * 一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄。
 * Context类是一个上下文环境类，Plus和Minus分别是用来计算的实现。
 *
 * 解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等！
 */
public interface Expression {
    int interpret(Contexts context);
}
