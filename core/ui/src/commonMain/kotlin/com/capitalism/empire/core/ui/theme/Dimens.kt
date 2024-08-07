package com.capitalism.empire.core.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class CEDimens(
    val paddingExtraLarge: Dp,
    val paddingLarge: Dp,
    val paddingMedium: Dp,
    val paddingSmall: Dp,
)

val LocalCEDimens = staticCompositionLocalOf {
    CEDimens(
        paddingExtraLarge = 32.dp,
        paddingLarge = 24.dp,
        paddingMedium = 16.dp,
        paddingSmall = 8.dp
    )
}