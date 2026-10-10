package com.example.unitconvertertesting

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun ConverterScreen(
    viewModel: ConverterViewModel = ConverterViewModel()
) {
    var input by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Unit Converter",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = input,
            onValueChange = { input = it },
            label = { Text("Celsius") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                val value = input.toDoubleOrNull()

                result = if (value != null) {
                    val converted =
                        viewModel.convertCelsiusToFahrenheit(value)

                    "$converted °F"
                } else {
                    "Invalid input"
                }
            }
        ) {
            Text("Convert")
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = result
        )
    }
}