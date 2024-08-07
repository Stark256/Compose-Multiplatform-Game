import androidx.compose.runtime.Composable
import com.capitalism.empire.core.ui.theme.CETheme
import com.capitalism.empire.feature.home.HomeScreen
import com.capitalism.empire.feature.splash.SplashScreen
import moe.tlaster.precompose.PreComposeApp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    PreComposeApp {
        CETheme {
            NavigationHost()
        }
    }
}

@Composable
fun NavigationHost() {
    SplashScreen(
        navigateToHomeScreen = {
            HomeScreen()
        }
    )
}

