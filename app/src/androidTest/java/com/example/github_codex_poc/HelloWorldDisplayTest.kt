package com.example.github_codex_poc

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class HelloWorldDisplayTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun appLaunchShowsHelloWorld() {
        composeTestRule.onNodeWithText("Hello world!").assertIsDisplayed()
    }
}
