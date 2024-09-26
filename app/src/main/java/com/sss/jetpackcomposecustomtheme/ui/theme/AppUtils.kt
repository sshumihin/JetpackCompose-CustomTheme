package com.sss.jetpackcomposecustomtheme.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember

@Composable
fun AppUtils(
    appDimens: Dimens,
    content: @Composable () -> Unit
) {
    val appDimens: Dimens = remember { appDimens }

    CompositionLocalProvider(LocalAppDimens provides appDimens) {
        content()
    }
}

val LocalAppDimens = compositionLocalOf { CompactDimens }