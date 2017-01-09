package com.daniel.www.chainofresponsibility;

/**
 * desc:AbstractHandler
 * Author: Daniel
 * Date: 2017-01-09 17:25
 *
 * 提供了get和set方法，方便MyHandle类设置和修改引用对象，
 * MyHandle类是核心，实例化后生成一系列相互持有的对象，构成一条链。
 */
public abstract class AbstractHandler {
    private Handlers handler;

    public Handlers getHandler() {
        return handler;
    }

    public void setHandler(Handlers handler) {
        this.handler = handler;
    }
}
