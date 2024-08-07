package com.capitalism.empire.core.ui.theme

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Composable
fun Modifier.transparentBackground(
    color: Color = Color.Transparent
) = this.background(
    color = color
)

@Composable
fun Modifier.gradientBackground(
    firstColor: Color = CETheme.colorScheme.primary,
    secondColor: Color = CETheme.colorScheme.secondary,
) = this.background(
    Brush.horizontalGradient(
        colors = listOf(firstColor, secondColor)
    )
)

@Composable
fun Modifier.primaryBackground(
    color: Color = CETheme.colorScheme.backgroundPrimary
) = this.background(
    color = color
)

@Composable
fun Modifier.secondaryBackground(
    color: Color = CETheme.colorScheme.backgroundSecondary
) = this.background(
    color = color
)

@Composable
fun Modifier.tertiaryBackground(
    color: Color = CETheme.colorScheme.backgroundTertiary
) = this.background(
    color = color
)