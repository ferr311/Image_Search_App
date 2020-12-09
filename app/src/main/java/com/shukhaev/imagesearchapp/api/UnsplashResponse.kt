package com.shukhaev.imagesearchapp.api

import com.shukhaev.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)