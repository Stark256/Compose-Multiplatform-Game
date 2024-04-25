package resources.strings

import capitalismempire.composeapp.generated.resources.Res
import capitalismempire.composeapp.generated.resources.*
import com.capitalism.empire.ui.resources.strings.ResourceStringsTabs
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.StringResource

@OptIn(ExperimentalResourceApi::class)
object ResourceStringsTabsImpl: ResourceStringsTabs {
    override val investing: StringResource = Res.string.home_menu_item_investing
    override val business: StringResource = Res.string.home_menu_item_business
    override val wallet: StringResource = Res.string.home_menu_item_wallet
    override val collections: StringResource = Res.string.home_menu_item_collections
    override val profile: StringResource = Res.string.home_menu_item_profile
}