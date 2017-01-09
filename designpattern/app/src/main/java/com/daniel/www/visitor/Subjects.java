package com.daniel.www.visitor;

/**
 * desc:Subjects
 * Author: Daniel
 * Date: 2017-01-09 17:41
 */
public interface Subjects {

    void accept(Visitor visitor);

    String getSubject();
}
