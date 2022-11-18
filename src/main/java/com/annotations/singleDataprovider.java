package com.annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class singleDataprovider {
    @Test(dataProvider = "dp")
    public void login(Object[] s) {
        for (int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }

        System.out.println();
    }
    @DataProvider()
            public Object[][] dp(){
    Object[][] data=new Object[][]{
            {"mani", 234, "abc", 123},
            {"pqr", 456},
            {"bcd",323,"111"}
        };
    return data;

}}
