package com.daniel.www.factorymethod.statics;

import com.daniel.www.factorymethod.MailSender;
import com.daniel.www.factorymethod.Sender;
import com.daniel.www.factorymethod.SmsSender;

/**
 * desc:SendStaticFactory
 * Author: Daniel
 * Date: 2017-01-05 10:45
 * 静态工厂方法模式
 * 将多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 */
public class SendStaticFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static  Sender produceSms() {
        return new SmsSender();
    }

}
