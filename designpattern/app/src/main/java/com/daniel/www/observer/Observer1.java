package com.daniel.www.observer;

/**
 * desc:Observer1
 * Author: Daniel
 * Date: 2017-01-09 14:19
 */
public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
