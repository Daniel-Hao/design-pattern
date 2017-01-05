package com.daniel.www.proxy;

/**
 * desc:Proxy
 * Author: Daniel
 * Date: 2017-01-05 15:40
 */
public class Proxy implements Sourceable {

    private Source source;
    public Proxy(){
        super();
        this.source = new Source();
    }
    @Override
    public void method() {
        before();
        source.method();
        atfer();
    }
    private void atfer() {
        System.out.println("after proxy!");
    }
    private void before() {
        System.out.println("before proxy!");
    }
}
