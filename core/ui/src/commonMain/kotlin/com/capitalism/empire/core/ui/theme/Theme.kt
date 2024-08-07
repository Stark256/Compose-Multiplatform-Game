package com.capitalism.empire.core.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb

private val LightColors = lightColorScheme(
    primary = ce_theme_primary_light,
    onPrimary = ce_theme_onBackgroundPrimary_light,
    secondary = ce_theme_secondary_light,
    onSecondary = ce_theme_onBackgroundPrimary_light,
    tertiary = ce_theme_backgroundTertiary_light,
    onTertiary = ce_theme_onBackgroundTertiary_light,
    background = ce_theme_backgroundSecondary_light,
    onBackground = ce_theme_onBackgroundSecondarySmall_light
)

private val DarkColors = lightColorScheme(
    primary = ce_theme_primary_dark,
    onPrimary = ce_theme_onBackgroundPrimary_dark,
    secondary = ce_theme_secondary_dark,
    onSecondary = ce_theme_onBackgroundPrimary_dark,
    tertiary = ce_theme_backgroundTertiary_dark,
    onTertiary = ce_theme_onBackgroundTertiary_dark,
    background = ce_theme_backgroundSecondary_dark,
    onBackground = ce_theme_onBackgroundSecondarySmall_dark
)

private val CEThemeColorsLight = CEThemeColors(
    primary = ce_theme_primary_light,
    secondary = ce_theme_secondary_light,
    backgroundPrimary = ce_theme_backgroundPrimary_light,
    onBackgroundPrimary = ce_theme_onBackgroundPrimary_light,
    backgroundSecondary = ce_theme_backgroundSecondary_light,
    onBackgroundSecondary = ce_theme_onBackgroundSecondary_light,
    onBackgroundSecondarySmall = ce_theme_onBackgroundSecondarySmall_light,
    backgroundTertiary = ce_theme_backgroundTertiary_light,
    onBackgroundTertiary = ce_theme_onBackgroundTertiary_light
)

private val CEThemeColorsDark = CEThemeColors(
    primary = ce_theme_primary_dark,
    secondary = ce_theme_secondary_dark,
    backgroundPrimary = ce_theme_backgroundPrimary_dark,
    onBackgroundPrimary = ce_theme_onBackgroundPrimary_dark,
    backgroundSecondary = ce_theme_backgroundSecondary_dark,
    onBackgroundSecondary = ce_theme_onBackgroundSecondary_dark,
    onBackgroundSecondarySmall = ce_theme_onBackgroundSecondarySmall_dark,
    backgroundTertiary = ce_theme_backgroundTertiary_dark,
    onBackgroundTertiary = ce_theme_onBackgroundTertiary_dark
)


val LocalCEColors = staticCompositionLocalOf {
    CEThemeColors(
        primary = Color.Unspecified,
        secondary = Color.Unspecified,
        backgroundPrimary = Color.Unspecified,
        onBackgroundPrimary = Color.Unspecified,
        backgroundSecondary = Color.Unspecified,
        onBackgroundSecondary = Color.Unspecified,
        onBackgroundSecondarySmall = Color.Unspecified,
        backgroundTertiary = Color.Unspecified,
        onBackgroundTertiary = Color.Unspecified
    )
}

val ColorScheme.backgroundPrimary: Color
    @Composable
    @ReadOnlyComposable
    get() = LocalCEColors.current.backgroundPrimary

val ColorScheme.onBackgroundPrimary: Color
    @Composable
    @ReadOnlyComposable
    get() = LocalCEColors.current.onBackgroundPrimary

val ColorScheme.backgroundSecondary: Color
    @Composable
    @ReadOnlyComposable
    get() = LocalCEColors.current.backgroundSecondary

val ColorScheme.onBackgroundSecondary: Color
    @Composable
    @ReadOnlyComposable
    get() = LocalCEColors.current.onBackgroundSecondary

val ColorScheme.onBackgroundSecondarySmall: Color
    @Composable
    @ReadOnlyComposable
    get() = LocalCEColors.current.onBackgroundSecondarySmall

val ColorScheme.backgroundTertiary: Color
    @Composable
    @ReadOnlyComposable
    get() = LocalCEColors.current.backgroundTertiary

val ColorScheme.onBackgroundTertiary: Color
    @Composable
    @ReadOnlyComposable
    get() = LocalCEColors.current.onBackgroundTertiary

@Composable
fun CETheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = DarkColors.takeIf { darkTheme } ?: LightColors
    val ceThemeColors = CEThemeColorsDark.takeIf { darkTheme } ?: CEThemeColorsLight


    // TODO fix status bar for both platforms

//    val view = LocalView.current
//    if(!view.isInEditMode) {
//        val window = (view.context as Activity).window
//        window.statusBarColor = colorScheme.primary.toArgb()
//        WindowCompat.getInsetsController(window, view).isAppearanceLightNavigationBars = darkTheme
//    }

    CompositionLocalProvider(
        LocalCEColors provides ceThemeColors
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}

object CETheme {
    val colorScheme: ColorScheme
        @Composable
        @ReadOnlyComposable
        get() =  MaterialTheme.colorScheme

    val typography: CETypography
        @Composable
        @ReadOnlyComposable
        get() = LocalCETypography.current

    val shapes: Shapes
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.shapes

    val dimens: CEDimens
        @Composable
        @ReadOnlyComposable
        get() = LocalCEDimens.current
}