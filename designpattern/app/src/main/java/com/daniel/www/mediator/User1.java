package com.daniel.www.mediator;

/**
 * desc:User1
 * Author: Daniel
 * Date: 2017-01-09 17:47
 */
public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
