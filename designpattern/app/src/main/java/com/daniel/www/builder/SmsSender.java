package com.daniel.www.builder;

/**
 * desc:SmsSender
 * Author: Daniel
 * Date: 2017-01-05 14:39
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
