package com.capitalism.empire.core.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class CEThemeColors(
    val primary: Color,
    val secondary: Color,
    val backgroundPrimary: Color,
    val onBackgroundPrimary: Color,
    val backgroundSecondary: Color,
    val onBackgroundSecondary: Color,
    val onBackgroundSecondarySmall: Color,
    val backgroundTertiary: Color,
    val onBackgroundTertiary: Color
)