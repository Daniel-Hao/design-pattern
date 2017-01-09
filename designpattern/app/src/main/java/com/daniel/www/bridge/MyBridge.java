package com.daniel.www.bridge;

/**
 * desc:MyBridge
 * Author: Daniel
 * Date: 2017-01-09 13:41
 */
public class MyBridge extends Bridge{

    public void method(){
        getSource().method();
    }
}
