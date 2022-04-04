package com.example.uts.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Olahraga(
    @StringRes val stringResourceId: Int,
    @StringRes val stringResourceId2: Int,
    @DrawableRes val imageResourceId: Int,
    @DrawableRes val imageResourceId2: Int

)