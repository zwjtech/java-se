package com.javase.datastructure.booleans;

import org.junit.Test;

/**
 * Created by zhangWeiJie on 2017/12/26.
 */
public class BooleanTest {
    @Test
    public void testm1(){
        Boolean b1=Boolean.FALSE;
        testm2(b1);
        System.out.println(b1);
        System.out.println(testm2(b1));
    }

    private boolean testm2(Boolean b1) {
        b1=Boolean.TRUE;
        System.out.println(b1);
        return b1;
    }

    @Test
    public void testm3(){
        boolean b1=false;
        testm4(b1);
        System.out.println(b1);
        System.out.println(testm4(b1));
    }

    private boolean testm4(boolean b1) {
        b1=true;
        System.out.println(b1);
        return b1;
    }
}
