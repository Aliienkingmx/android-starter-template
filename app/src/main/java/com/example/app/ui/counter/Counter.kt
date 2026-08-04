package com.example.app.ui.counter

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue

class Counter(initialValue: Int = 0) {
  var value by mutableIntStateOf(initialValue)
    private set

  fun increment() {
    value += 1
  }

  fun reset() {
    value = 0
  }
}
