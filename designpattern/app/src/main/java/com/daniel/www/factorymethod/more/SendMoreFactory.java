package com.daniel.www.factorymethod.more;

import com.daniel.www.factorymethod.MailSender;
import com.daniel.www.factorymethod.Sender;
import com.daniel.www.factorymethod.SmsSender;

/**
 * desc:SendMoreFactory
 * Author: Daniel
 * Date: 2017-01-05 10:45
 * 多个工厂方法模式
 * 普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，
 * 则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。
 */
public class SendMoreFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

}
