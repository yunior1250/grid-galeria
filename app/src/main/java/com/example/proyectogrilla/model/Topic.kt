package com.example.proyectogrilla.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
      val courses: Int,
    @DrawableRes val imageResourceId: Int
)