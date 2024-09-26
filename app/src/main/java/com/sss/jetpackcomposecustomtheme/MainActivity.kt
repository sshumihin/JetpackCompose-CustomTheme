package com.sss.jetpackcomposecustomtheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sss.jetpackcomposecustomtheme.screens.LoginScreen
import com.sss.jetpackcomposecustomtheme.ui.theme.JetpackComposeLoginScreenTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeLoginScreenTutorialTheme {
                LoginScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeLoginScreenTutorialTheme {
        LoginScreen()
    }
}