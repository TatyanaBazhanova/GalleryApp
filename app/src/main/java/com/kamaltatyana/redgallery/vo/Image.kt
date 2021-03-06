package com.kamaltatyana.redgallery.vo

data class Image(
    val largeImageURL : String,
    val webformatHeight : Int,
    val webformatWidth : Int,
    val likes : Int,
    val imageWidth : Int,
    val id : Int,
    val user_id : Int,
    val views : Int,
    val comments : Int,
    val pageURL : String,
    val imageHeight : Int,
    val webformatURL : String,
    val type : String,
    val previewHeight : Int,
    val tags : String,
    val downloads : Int,
    val user : String,
    val favorites : Int,
    val imageSize : Int,
    val previewWidth : Int,
    val userImageURL : String)
