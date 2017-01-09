package com.daniel.www.iterator;

/**
 * desc:Iterators
 * Author: Daniel
 * Date: 2017-01-09 17:15
 */
public interface Iterators {

    //前移
    Object previous();

    //后移
    Object next();

    boolean hasNext();

    //取得第一个元素
    Object first();
}
