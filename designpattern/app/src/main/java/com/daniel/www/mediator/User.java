package com.daniel.www.mediator;

/**
 * desc:User
 * Author: Daniel
 * Date: 2017-01-09 17:47
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
