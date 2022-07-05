package com.hillel.homework.lesson15.temperatureConverter.tripleConvertor;

public class Fahrenheit extends Temperature {

    public static float calculateTemperatureFahrenheitToCelsius(float temperature, float fahrenheitCoefficient, int fahrenheitConst) {
        return  (temperature - fahrenheitConst * fahrenheitCoefficient);
    }

    public static float calculateTemperatureFahrenheitToKelvin(float temperature, float kelvinConst, float fahrenheitCoefficient, int fahrenheitConst) {
        return  (temperature - fahrenheitConst * fahrenheitCoefficient) + kelvinConst;
    }

}
