package com.daniel.www.decorator;

/**
 * desc:Decorator
 * Author: Daniel
 * Date: 2017-01-05 15:34
 * 裝飾類
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }
    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
