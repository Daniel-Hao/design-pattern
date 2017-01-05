package com.daniel.www.abstractfactory;

/**
 * desc:MailSender
 * Author: Daniel
 * Date: 2017-01-05 10:42
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
