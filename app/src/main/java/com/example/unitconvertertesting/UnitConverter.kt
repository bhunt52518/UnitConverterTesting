package com.example.unitconvertertesting

object UnitConverter {
    fun celsiusToFahrenheit(celsius: Double): Double{
        return(celsius * (9.0/5.0)) + 32
    }
    fun fahrenheitToCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32) * (5.0/9.0)
    }
    fun milesToKilometers(miles: Double): Double {
        return miles * 1.60934
    }
    fun kilometersToMiles(kilometers: Double): Double {
        return kilometers / 1.60934
    }
    fun poundsToKilograms(pounds: Double): Double {
        return pounds * 0.453592
    }
    fun kilogramsToPounds(kilograms: Double): Double {
        return kilograms / 0.453592
    }

}