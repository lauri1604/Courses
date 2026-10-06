package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// Paso 1: representar un tema con sus recursos y el número de cursos disponibles.
data class Topic(
    @StringRes val name: Int,
    val availableCourses: Int,
    @DrawableRes val imageResourceId: Int
)
