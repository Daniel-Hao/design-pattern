package com.daniel.www.strategy;

/**
 * desc:ICalculator
 * Author: Daniel
 * Date: 2017-01-09 13:56
 *
 * 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，
 * 且算法的变化不会影响到使用算法的客户。需要设计一个接口，为一系列实现类提供统一的方法，
 * 多个实现类实现该接口，设计一个抽象类（可有可无，属于辅助类），提供辅助函数
 *
 * 策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。
 * 因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
 */
public interface ICalculator {

    int calculate(String exp);
}



/**
 *
 * 行为型模式
 * 父类与子类:策略模式、模板方法模式;
 * 两个类之间:观察者模式、迭代子模式、责任链模式、命令模式;
 * 类的状态:备忘录模式、状态模式;
 * 通过中间类:访问者模式、中介者模式、解释器模式;
 *
 */