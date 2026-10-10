package com.example.unitconvertertesting

import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class HiltConversionIntegrationTest {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var conversionService: ConversionService

    @Before
    fun setup() {
        hiltRule.inject()
    }

    @Test
    fun injectedConversionService_conversionCelsiusToFahrenheit() {
        val result = conversionService.celsiusToFahrenheit(100.0)
        assertEquals(212.0, result, 0.01)
    }
    @Test
    fun injectedConversionService_convertFahrenheitToCelsius() {
        val result = conversionService.fahrenheitToCelsius(212.0)
        assertEquals(100.0, result, 0.01)
    }
    @Test
    fun injectedConversionService_convertPoundsToKilograms() {
        val result = conversionService.poundsToKilograms(10.0)
        assertEquals(4.53592, result, 0.00001)
    }
    @Test
    fun injectedConversionService_convertKilogramsToPounds() {
        val result = conversionService.kilogramsToPounds(4.53592)
        assertEquals(10.0, result, 0.00001)
    }
    @Test
    fun injectedConversionService_convertMilesToKilometers() {
        val result = conversionService.milesToKilometers(1.0)
        assertEquals(1.60934, result, 0.00001)
    }
    @Test
    fun injectedConversionService_convertKilometersToMiles() {
        val result = conversionService.kilometersToMiles(1.60934)
        assertEquals(1.0, result, 0.00001)
    }
}