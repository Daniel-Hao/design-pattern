package com.daniel.www.bridge;

/**
 * desc:Bridge
 * Author: Daniel
 * Date: 2017-01-09 13:41
 */
public abstract class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
