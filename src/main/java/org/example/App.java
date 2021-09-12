/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

public class App
{
    public static void main(String[] args)
    {
        TemperatureConverter tempConverter = new TemperatureConverter();
        String conversionTypeInput = tempConverter.getConversionTypeInput();
        String inputTempType = tempConverter.getInputTemperatureText(conversionTypeInput);
        int inputTempValue = tempConverter.getTemperatureValue(inputTempType);
        String resultMessage = tempConverter.convert(inputTempType, inputTempValue);
        System.out.println(resultMessage);
    }
}
