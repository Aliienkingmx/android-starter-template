package com.example.app.ui.counter

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.ConscryptMode
import org.robolectric.annotation.GraphicsMode
import org.robolectric.annotation.SQLiteMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.LEGACY)
@SQLiteMode(SQLiteMode.Mode.LEGACY)
@ConscryptMode(ConscryptMode.Mode.OFF)
@Config(sdk = [36])
class CounterScreenTest {

  @get:Rule
  val composeRule = createComposeRule()

  @Test
  fun `increment button increases the counter`() {
    composeRule.setContent { CounterScreen() }

    composeRule.onNodeWithText("Counter: 0").assertIsDisplayed()
    composeRule.onNodeWithText("Increment").performClick()
    composeRule.onNodeWithText("Counter: 1").assertIsDisplayed()
  }

  @Test
  fun `reset button returns the counter to zero`() {
    composeRule.setContent { CounterScreen() }

    composeRule.onNodeWithText("Increment").performClick()
    composeRule.onNodeWithText("Reset").performClick()
    composeRule.onNodeWithText("Counter: 0").assertIsDisplayed()
  }
}
