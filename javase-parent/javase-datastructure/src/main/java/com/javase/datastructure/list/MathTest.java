package com.javase.datastructure.list;

import org.junit.Test;

import static java.lang.Float.NaN;

/**
 * Created by zhangWeiJie on 2017/12/23.
 */
public class MathTest {

    @Test
    public void testMin(){
       int i= Math.min(-0,+0);
        System.out.println(i);
        System.out.println(Math.min(12.4,NaN));
    }
}
