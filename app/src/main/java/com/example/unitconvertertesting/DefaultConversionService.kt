package com.example.unitconvertertesting

import javax.inject.Inject

class DefaultConversionService @Inject constructor(): ConversionService{
    override fun celsiusToFahrenheit(value: Double): Double {
        return UnitConverter.celsiusToFahrenheit(value)
    }

    override fun fahrenheitToCelsius(value: Double): Double {
        return UnitConverter.fahrenheitToCelsius(value)
    }

    override fun poundsToKilograms(value: Double): Double {
        return UnitConverter.poundsToKilograms(value)
    }

    override fun kilogramsToPounds(value: Double): Double {
        return UnitConverter.kilogramsToPounds(value)
    }

    override fun milesToKilometers(value: Double): Double {
        return UnitConverter.milesToKilometers(value)
    }

    override fun kilometersToMiles(value: Double): Double {
        return UnitConverter.kilometersToMiles(value)
    }
}