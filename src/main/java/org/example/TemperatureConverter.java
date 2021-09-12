/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

import java.text.MessageFormat;
import java.util.Scanner;

public class TemperatureConverter
{
    final String CELSIUS = "Celsius";
    final String FAHRENHEIT = "Fahrenheit";

    private Scanner scanner = new Scanner(System.in);

    public String getConversionTypeInput()
    {
        String conversionTypeInput;
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");

        conversionTypeInput = scanner.nextLine();
        System.out.println(MessageFormat.format("Your choice: {0}", conversionTypeInput));

        return conversionTypeInput;
    }

    public String getInputTemperatureText(String conversionTypeInput)
    {
        String inputTempTypeText = "";
        if(conversionTypeInput.equalsIgnoreCase("c"))
        {
            inputTempTypeText = CELSIUS;
        }
        else if(conversionTypeInput.equalsIgnoreCase("f"))
        {
            inputTempTypeText = FAHRENHEIT;
        }
        else
        {
            String invalidMessage = MessageFormat.format("Error {0} is an invalid entry for temperature type.", inputTempTypeText);
            System.out.println(invalidMessage);
            System.exit(0);
        }

        return inputTempTypeText;
    }

    public int getTemperatureValue(String inputTempType)
    {
        System.out.print(MessageFormat.format("Please enter the temperature in {0}: ", inputTempType));
        return scanner.nextInt();
    }

    public double convertToCelsius(double tempInFahrenheit)
    {
        return (tempInFahrenheit - 32) * 5.0 / 9.0;
    }

    public double convertToFahrenheit(double tempInCelsius )
    {
        return tempInCelsius * 9.0 / 5.0 + 32;
    }

    public String convert(String inputTempType, int inputTempValue)
    {
        double result;
        final String resultTempType;

        if(inputTempType.equals(CELSIUS))
        {
            result = convertToFahrenheit(inputTempValue);
            resultTempType = FAHRENHEIT;
        }
        else
        {
            result = convertToCelsius(inputTempValue);
            resultTempType = CELSIUS;
        }
        return MessageFormat.format("The temperature in {0} is {1}.", resultTempType, Math.round(result));
    }
}
