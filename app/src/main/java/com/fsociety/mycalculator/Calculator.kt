package com.fsociety.mycalculator

import android.graphics.Paint.Style
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

@Composable
fun Calculator(modifier : Modifier = Modifier){
    Box(modifier = Modifier) {
        Column(modifier = modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.End) {
            Text(
                text = "159*26",
                style = TextStyle(
                    fontSize = 30.sp,
                    textAlign = TextAlign.End
                ),
                maxLines = 5,
                overflow = TextOverflow.Ellipsis
            )

        }
    }
}