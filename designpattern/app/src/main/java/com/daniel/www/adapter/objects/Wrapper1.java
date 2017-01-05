package com.daniel.www.adapter.objects;

/**
 * desc:Wrapper1
 * Author: Daniel
 * Date: 2017-01-05 15:08
 *
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，
 * 而是持有Source类的实例，以达到解决兼容性的问题。
 */
public class Wrapper1 implements Targetable {

    private Source source;

    public Wrapper1(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}
