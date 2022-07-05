package com.hillel.homework.lesson15.temperatureConverter.tripleConvertor;

public class Kelvin extends Temperature {


    public static float calculateTemperatureKelvinToCelsius(float temperature, float kelvinConst) {
        return  (temperature - kelvinConst);

    }

    public static float calculateTemperatureKelvinToFahrenheit(float temperature, float kelvinConst, float fahrenheitCoefficient, int fahrenheitConst) {
        return  ((temperature - kelvinConst) * fahrenheitCoefficient + fahrenheitConst);
    }
}