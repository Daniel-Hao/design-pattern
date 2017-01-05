package com.daniel.www.builder;

/**
 * desc:MailSender
 * Author: Daniel
 * Date: 2017-01-05 14:39
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
