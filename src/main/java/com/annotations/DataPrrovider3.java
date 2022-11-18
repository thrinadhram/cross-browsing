package com.annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPrrovider3 {

   /* @Test(dataProvider = "data")
    public void loginTest(String s)
    {
        System.out.println(s);
    }*/
    @DataProvider(name = "data")
    public String[] dp1(){
        String[] data=new String[]{
                "manikanta","raju","ravi","kumar","suresh"
        };
        return data;
    }
}
