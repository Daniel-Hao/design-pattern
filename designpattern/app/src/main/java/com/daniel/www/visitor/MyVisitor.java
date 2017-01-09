package com.daniel.www.visitor;

/**
 * desc:MyVisitor
 * Author: Daniel
 * Date: 2017-01-09 17:41
 */
public class MyVisitor implements Visitor {

    @Override
    public void visit(Subjects sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
