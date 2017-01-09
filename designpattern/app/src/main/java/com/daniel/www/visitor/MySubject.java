package com.daniel.www.visitor;

/**
 * desc:MySubject
 * Author: Daniel
 * Date: 2017-01-09 17:42
 */
public class MySubject implements Subjects {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
