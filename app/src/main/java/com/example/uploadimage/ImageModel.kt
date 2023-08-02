package com.example.uploadimage
import com.google.gson.annotations.SerializedName



data class ImageModel(
    @SerializedName("idImage")
    var idImage:String,
    @SerializedName("namImage")
    var namImage:String,
    @SerializedName("image")
    var image:String,



)
