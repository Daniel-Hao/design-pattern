package com.daniel.www.factorymethod.common;

import com.daniel.www.factorymethod.MailSender;
import com.daniel.www.factorymethod.Sender;
import com.daniel.www.factorymethod.SmsSender;

/**
 * desc:SendCommonFactory
 * Author: Daniel
 * Date: 2017-01-05 10:45
 * 普通工厂模式
 * 建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 */
public class SendCommonFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
