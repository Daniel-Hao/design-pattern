package com.daniel.www.chainofresponsibility;

/**
 * desc:MyHandler
 * Author: Daniel
 * Date: 2017-01-09 17:26
 */
public class MyHandler extends AbstractHandler implements Handlers {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name+"deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }
}
