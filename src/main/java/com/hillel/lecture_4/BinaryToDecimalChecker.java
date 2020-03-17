package com.hillel.lecture_4;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {

//        TODO implements result
        int result = 0;

        String tempString = "";

        while (value > 0){
            tempString = value % 2 + tempString;
            value = value / 2;
        }

        result = Integer.parseInt(tempString);

        return result;
    }

    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;

        //1100001001

        String valueStr = Integer.toString(value);
        for (int i = 0; i < valueStr.length();) {
            Character ch = valueStr.charAt(i);
            int n = Integer.parseInt(ch.toString());
            i++;
            double k = Math.pow(2, valueStr.length()-i);
            result += n * k;


        }

        return result;
    }
}
