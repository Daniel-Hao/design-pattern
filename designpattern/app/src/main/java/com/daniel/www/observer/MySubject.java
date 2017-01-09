package com.daniel.www.observer;

/**
 * desc:MySubject
 * Author: Daniel
 * Date: 2017-01-09 14:27
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

}
