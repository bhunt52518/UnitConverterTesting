package com.example.unitconvertertesting

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import org.junit.Rule
import org.junit.Test

class ConverterScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun celsiusConversion_displayCorrectResult() {

        composeTestRule.setContent { ConverterScreen() }
        composeTestRule.onNodeWithText("Celsius").performTextInput("100")
        composeTestRule.onNodeWithText("Convert").performClick()
        composeTestRule.onNodeWithText("212.0 °F").assertIsDisplayed()
    }

    @Test
    fun invalidInput_DisplaysErrorMessage() {

        composeTestRule.setContent { ConverterScreen() }
        composeTestRule.onNodeWithText("Celsius").performTextInput("abc")
        composeTestRule.onNodeWithText("Convert").performClick()
        composeTestRule.onNodeWithText("Invalid input").assertIsDisplayed()
    }
}