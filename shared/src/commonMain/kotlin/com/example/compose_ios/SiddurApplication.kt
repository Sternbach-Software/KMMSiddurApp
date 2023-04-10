package com.example.compose_ios

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.compose_ios.util.parseMarkdown
import com.example.compose_ios.strings.AshkenazSiddur

@OptIn(ExperimentalUnitApi::class)
@Composable
internal fun SiddurApplication(displayTopAppBar: Boolean) {
    MaterialTheme {
        Scaffold(
            topBar = { /*if(displayTopAppBar) */TopAppBar() { Text("Free siddur") } },
            content = {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center,
                ) {
                    Column(
                        modifier = Modifier
                            .verticalScroll(rememberScrollState())
                            .padding(16.dp)
                            .background(Color(0xFF_FBF0D9)),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Text("From Compose! SiddurApplication()")
                        Text(
                            AshkenazSiddur.SHACHRIS.parseMarkdown(),
                            color = Color(0xFF_5F4B32),
                            fontSize = TextUnit(18F, TextUnitType.Sp)
                        )
                    }
                }
            },
        )
    }
}
