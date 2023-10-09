package com.example.fragmentnavigationboxesgame

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Implement this interface in your fragment if you want to show additional action in the toolbar
 * while that fragment is displayed to the user.
 */

interface HasCustomAction {

        fun getCustomAction(): CustomAction

}

class CustomAction(
    @DrawableRes val iconRes: Int,
    @StringRes val textRes: Int,
    val onCustomAction: Runnable
)

