package com.java.day06.wrapper;

import org.junit.jupiter.api.Test;

/**
 * User: guodong
 * Date: 2019-01-03
 * Description:
 */
public class TestWrapper {
    @Test
    public void testIntToInteger(){
        int i = 10;
        boolean b = false;
        Integer i1 = new Integer("10");
        System.out.println("i1=" + i1);
    }

    @Test
    public void testIntToString() {
        int i1 = 10;
        String str1 = i1 + "";
        String str2 = String.valueOf(40);
        System.out.println(str2);

    }


}
