package com.daniel.www.iterator;

/**
 * desc:MyCollection
 * Author: Daniel
 * Date: 2017-01-09 17:16
 *
 * MyCollection中定义了集合的一些操作
 */
public class MyCollection implements Collections {

    public String string[] = {"A","B","C","D","E"};

    @Override
    public Iterators iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
