package com.example.unitconvertertesting

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Assert.assertEquals
import org.junit.Test

class ConverterViewModelTest {
    @Test
    fun convertCelsiusToFahrenheit_usesConversionService() {
        val mockService = mockk<ConversionService>()
        every {mockService.celsiusToFahrenheit(100.0)} returns 212.0

        val viewModel = ConverterViewModel(mockService)

        val result = viewModel.convertCelsiusToFahrenheit(100.0)
        assertEquals(212.0, result, 0.01)

        verify { mockService.celsiusToFahrenheit(100.0) }

    }
    @Test
    fun convertFahrenheitToCelsius_usesConversionService() {
        val mockService = mockk<ConversionService>()
        every { mockService.fahrenheitToCelsius(212.0) } returns 100.0

        val viewModel = ConverterViewModel(mockService)

        val result = viewModel.convertFahrenheitToCelsius(212.0)
        assertEquals(100.0, result, 0.01)

        verify { mockService.fahrenheitToCelsius(212.0) }
    }
    @Test
    fun convertPoundsToKilograms_usesConversionService() {
        val mockService = mockk<ConversionService>()
        every { mockService.poundsToKilograms(10.0) } returns 4.53592

        val viewModel = ConverterViewModel(mockService)

        val result = viewModel.convertPoundsToKilograms(10.0)
        assertEquals(4.53592, result, 0.00001)

        verify { mockService.poundsToKilograms(10.0) }
    }
    @Test
    fun convertKilogramsToPounds_usesConversionService() {
        val mockService = mockk<ConversionService>()
        every { mockService.kilogramsToPounds(4.53592) } returns 10.0

        val viewModel = ConverterViewModel(mockService)

        val result = viewModel.convertKilogramsToPounds(4.53592)
        assertEquals(10.0, result, 0.00001)

        verify { mockService.kilogramsToPounds(4.53592) }
    }
    @Test
    fun convertMilesToKilograms_usesConversionService() {
        val mockService = mockk<ConversionService>()
        every { mockService.milesToKilometers(1.0) } returns 1.60934

        val viewModel = ConverterViewModel(mockService)

        val result = viewModel.convertMilesToKilometers(1.0)
        assertEquals(1.60934, result, 0.00001)

        verify { mockService.milesToKilometers(1.0) }
    }
    @Test
    fun convertKilometersToMiles_usesConversionService() {
        val mockService = mockk<ConversionService>()
        every { mockService.kilometersToMiles(1.60934) } returns 1.0

        val viewModel = ConverterViewModel(mockService)

        val result = viewModel.convertKilometersToMiles(1.60934)
        assertEquals(1.0, result, 0.00001)

        verify { mockService.kilometersToMiles(1.60934) }
    }
}