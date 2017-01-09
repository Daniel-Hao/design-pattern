package com.daniel.www.memento;

/**
 * desc:Memento
 * Author: Daniel
 * Date: 2017-01-09 17:34
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
