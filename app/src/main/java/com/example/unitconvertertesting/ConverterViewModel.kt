package com.example.unitconvertertesting

import android.renderscript.Sampler
import androidx.lifecycle.ViewModel

class ConverterViewModel (
    private val conversionService: ConversionService = DefaultConversionService()
) : ViewModel() {
    fun convertCelsiusToFahrenheit(value: Double): Double {
        return conversionService.celsiusToFahrenheit(value)
    }
    fun convertFahrenheitToCelsius(value: Double): Double {
        return conversionService.fahrenheitToCelsius(value)
    }
    fun convertPoundsToKilograms(value: Double): Double {
        return conversionService.poundsToKilograms(value)
    }
    fun convertKilogramsToPounds(value: Double): Double {
        return conversionService.kilogramsToPounds(value)
    }
    fun convertMilesToKilometers(value: Double): Double {
        return conversionService.milesToKilometers(value)
    }
    fun convertKilometersToMiles(value: Double): Double {
        return conversionService.kilometersToMiles(value)
    }

}
