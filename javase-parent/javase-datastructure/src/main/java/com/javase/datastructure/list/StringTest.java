package com.javase.datastructure.list;

import org.junit.Test;

import java.util.Stack;

/**
 * Created by zhangWeiJie on 2017/12/21.
 */
public class StringTest {

    @Test
    public void testString(){
        String string1="Hello";
        String string2="Hello";
        System.out.println(string1==string2);
    }

    /**
     * 位补零右移：左操作数的值按右操作数指定的位数右移，移动得到的空位为零填补。
     * 位补零右移：将int型整数的二进制每位向右移动若干位，后面若干位右移出int范围的bit丢弃，前面若干位空出的bit全都补0。正数等同于除2的n次方，负数补零右移后变正数。
     */
    @Test
    public void testWeibulingyouyi(){
        System.out.println(-1>>>1);//2的30次方
//        int divided=2147483647;
//        decimalToBinary(divided);
        decimalToBinary(16);

        System.out.println(2^30);//位异或:两个操作数的某一位不相同时改位为1
        System.out.println(Math.pow(2,30));
        System.out.println(Math.pow(2,3));
    }

    private void decimalToBinary(Integer divided) {
        int i=0;
        Stack<Integer> stack=new Stack();
        do{
            System.out.println(i++);
            Integer mod=divided%2;
            divided=divided/2;
            stack.push(mod);
        }while (divided>0);
        System.out.println(stack.toString());
    }
}
