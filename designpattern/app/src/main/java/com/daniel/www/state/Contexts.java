package com.daniel.www.state;

/**
 * desc:Contexts
 * Author: Daniel
 * Date: 2017-01-09 17:37
 */
public class Contexts {
    private State state;

    public Contexts(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method() {
        if (state.getValue().equals("state1")) {
            state.method1();
        } else if (state.getValue().equals("state2")) {
            state.method2();
        }
    }
}
