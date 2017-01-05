package com.daniel.www.abstractfactory;

/**
 * desc:SendMainFactory
 * Author: Daniel
 * Date: 2017-01-05 13:47
 */
public class SendMainFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
