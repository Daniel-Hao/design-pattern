package com.daniel.www.factorymethod.common;

/**
 * desc:SmsSender
 * Author: Daniel
 * Date: 2017-01-05 10:43
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
