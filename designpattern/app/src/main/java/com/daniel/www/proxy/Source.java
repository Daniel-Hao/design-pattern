package com.daniel.www.proxy;

/**
 * desc:Source
 * Author: Daniel
 * Date: 2017-01-05 15:40
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
