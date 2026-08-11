package com.example.app.ui.counter

import android.content.Context
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.core.app.ApplicationProvider
import com.example.app.R
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
// SQLiteMode.LEGACY está deprecado pero es necesario en Termux (linux-aarch64).
@Suppress("DEPRECATION")
@SQLiteMode(SQLiteMode.Mode.LEGACY)
@ConscryptMode(ConscryptMode.Mode.OFF)
@Config(sdk = [36])
class CounterScreenTest {

  @get:Rule
  val composeRule = createComposeRule()

  private fun context(): Context = ApplicationProvider.getApplicationContext()

  private fun counterText(value: Int): String =
    context().getString(R.string.counter_value, value)

  @Test
  fun `increment button increases the counter`() {
    composeRule.setContent { CounterScreen() }

    composeRule.onNodeWithText(counterText(0)).assertIsDisplayed()
    composeRule.onNodeWithText(context().getString(R.string.increment)).performClick()
    composeRule.onNodeWithText(counterText(1)).assertIsDisplayed()
  }

  @Test
  fun `reset button returns the counter to zero`() {
    composeRule.setContent { CounterScreen() }

    composeRule.onNodeWithText(context().getString(R.string.increment)).performClick()
    composeRule.onNodeWithText(context().getString(R.string.reset)).performClick()
    composeRule.onNodeWithText(counterText(0)).assertIsDisplayed()
  }
}
