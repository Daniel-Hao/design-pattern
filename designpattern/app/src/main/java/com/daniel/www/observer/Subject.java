package com.daniel.www.observer;

/**
 * desc:Subject
 * Author: Daniel
 * Date: 2017-01-09 14:23
 */
public interface Subject {

    /*增加观察者*/
    void add(Observer observer);

    /*删除观察者*/
    void del(Observer observer);

    /*通知所有的观察者*/
    void notifyObservers();

    /*自身的操作*/
    void operation();
}
