package com.daniel.www.abstractfactory;

/**
 * desc:SendSmsFactory
 * Author: Daniel
 * Date: 2017-01-05 13:45
 */
public class SendSmsFactory implements Provider{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
