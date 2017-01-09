package com.daniel.www.memento;

/**
 * desc:Storage
 * Author: Daniel
 * Date: 2017-01-09 17:34
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
