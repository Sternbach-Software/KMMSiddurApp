package com.example.compose_ios

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.compose_ios.util.parseMarkdown

@Composable
internal fun SiddurApplication(displayTopAppBar: Boolean) {
    MaterialTheme {
        Scaffold(
            topBar = { if(displayTopAppBar) TopAppBar() { Text("Hello") } },
            content = {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center,
                ) {
                    Column {
                        Text("From Compose! SiddurApplication()")
                        Text("What if <b>I <em>want <small>to display another one?</small></em></b>".parseMarkdown())
                    }
                }
            },
        )
    }
}
