package com.hillel.lecture_9;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PhoneColorIsEqualTestTask {

    private PhoneColorIsEqualChecker phoneColorIsEqualChecker = new PhoneColorIsEqualChecker();

    @Test(dataProvider = "colorProvider")
    public void phoneColorIsEqualTest (String phoneColor, String expectedResult) {
        assertEquals(phoneColorIsEqualChecker.phoneColorIsEqual(phoneColor), expectedResult); ;
    }

    @DataProvider (name = "colorProvider")
    public static Object[][] colorProvider(){
        return new Object[][]{
                {"white", "Phone color is the same"},
                {"red", "Phone colors are different"},
                {"yellow", "Phone colors are different"},

        };
    }


}
