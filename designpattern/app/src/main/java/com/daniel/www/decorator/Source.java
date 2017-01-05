package com.daniel.www.decorator;

/**
 * desc:Source
 * Author: Daniel
 * Date: 2017-01-05 15:27
 * 被装饰类
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
