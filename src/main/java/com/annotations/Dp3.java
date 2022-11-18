package com.annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dp3 {

    @Test(dataProvider = "data",dataProviderClass = DataPrrovider3.class)
    public void loginTest(String s)
    {
        System.out.println(s);
    }

}
