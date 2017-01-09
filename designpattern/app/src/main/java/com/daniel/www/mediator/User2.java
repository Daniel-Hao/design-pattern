package com.daniel.www.mediator;

/**
 * desc:User2
 * Author: Daniel
 * Date: 2017-01-09 17:47
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
