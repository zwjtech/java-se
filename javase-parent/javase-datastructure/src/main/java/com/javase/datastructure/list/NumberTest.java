package com.javase.datastructure.list;

import org.junit.Test;

/**
 * Created by zhangWeiJie on 2017/12/23.
 */
public class NumberTest {

    @Test
    public void testNumberIntValue(){
        Double d1= 123.456;
        Float f1=111.222f;
        System.out.println(d1.intValue());
        System.out.println(f1.intValue());
    }

    @Test
    public void testfloatValue(){
        Integer i1=100;
        Long l1=200L;
        System.out.println(i1.floatValue());
        System.out.println(l1.floatValue());
    }

    @Test
    public void testbyteValue(){
        Integer i1=100;
        System.out.println(i1.byteValue());
        Integer i2=257;
        System.out.println(i2.byteValue());//1
    }
}
