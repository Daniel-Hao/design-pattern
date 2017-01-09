package com.daniel.www.iterator;

/**
 * desc:MyIterator
 * Author: Daniel
 * Date: 2017-01-09 17:17
 *
 * MyIterator中定义了一系列迭代操作，且持有Collection实例
 */
public class MyIterator implements Iterators {

    private Collections collection;
    private int pos = -1;

    public MyIterator(Collections collection){
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if(pos > 0){
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if(pos<collection.size()-1){
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if(pos<collection.size()-1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }
}
