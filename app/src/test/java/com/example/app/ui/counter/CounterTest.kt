package com.example.app.ui.counter

import org.junit.Assert.assertEquals
import org.junit.Test

class CounterTest {

  @Test
  fun `starts at zero by default`() {
    val counter = Counter()
    assertEquals(0, counter.value)
  }

  @Test
  fun `increment increases value by one`() {
    val counter = Counter()
    counter.increment()
    counter.increment()
    assertEquals(2, counter.value)
  }

  @Test
  fun `reset returns value to zero`() {
    val counter = Counter(5)
    counter.reset()
    assertEquals(0, counter.value)
  }
}
