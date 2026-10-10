package com.example.unitconvertertesting

interface ConversionService {
    fun celsiusToFahrenheit(value: Double): Double
    fun fahrenheitToCelsius(value: Double): Double
    fun milesToKilometers(value: Double): Double
    fun kilometersToMiles(value: Double): Double
    fun poundsToKilograms(value: Double): Double
    fun kilogramsToPounds(value: Double): Double
}