package com.daniel.www.templatemethod;

/**
 * desc:AbstractCalculator
 * Author: Daniel
 * Date: 2017-01-09 14:07
 *
 * 首先将exp和"\\+"做参数，调用AbstractCalculator类里的calculate(String,String)方法，
 * 在calculate(String,String)里调用同类的split()，之后再调用calculate(int ,int)方法，
 * 从这个方法进入到子类中，执行完return num1 + num2后，将值返回到AbstractCalculator类，
 * 赋给result，打印出来。
 */
public abstract class AbstractCalculator {

    /*主方法，实现对本类其它方法的调用*/
    public final int calculate(String exp,String opt){
        int array[] = split(exp,opt);
        return calculate(array[0],array[1]);
    }

    /*被子类重写的方法*/
    abstract public int calculate(int num1,int num2);

    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
