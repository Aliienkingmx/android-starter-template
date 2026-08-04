package com.example.app.ui.counter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CounterScreen(counter: Counter = remember { Counter() }) {
  Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
    Column(
      modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding)
        .padding(16.dp),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center,
    ) {
      Text(
        text = "Counter: ${counter.value}",
        style = MaterialTheme.typography.headlineMedium,
      )
      Button(
        onClick = { counter.increment() },
        modifier = Modifier.padding(top = 16.dp),
      ) {
        Text("Increment")
      }
      Button(
        onClick = { counter.reset() },
        modifier = Modifier.padding(top = 8.dp),
      ) {
        Text("Reset")
      }
    }
  }
}
