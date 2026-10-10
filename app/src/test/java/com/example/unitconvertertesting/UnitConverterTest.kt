package com.example.unitconvertertesting

import org.junit.Assert.assertEquals
import org.junit.Test

class UnitConverterTest {
    @Test
    fun celsiusToFahrenheit_returnsCorrectValue() {
        val result = UnitConverter.celsiusToFahrenheit(0.0)
        assertEquals(32.0, result, 0.01)
    }
    @Test
    fun fahrenheitToCelsius_returnsCorrectValue() {
        val result = UnitConverter.fahrenheitToCelsius(32.0)
        assertEquals(0.0, result, 0.01)
    }
    @Test
    fun milesToKilometers_returnsCorrectValue() {
        val result = UnitConverter.milesToKilometers(1.0)
        assertEquals(1.60934, result, 0.00001)
    }
    @Test
    fun kilometersToMiles_returnsCorrectValue() {
        val result = UnitConverter.kilometersToMiles(1.60934)
        assertEquals(1.0, result, .00001)
    }
    @Test
    fun poundsToKilograms_returnsCorrectValue() {
        val result = UnitConverter.poundsToKilograms(1.0)
        assertEquals(0.453592, result, 0.000001)
    }
    @Test
    fun kilogramsToPounds_returnsCorrectValue() {
        val result = UnitConverter.kilogramsToPounds(0.453592)
        assertEquals(1.0, result, 0.000001)
    }
}