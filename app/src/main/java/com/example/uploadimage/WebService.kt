package com.example.uploadimage

import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST



interface WebService {

    @FormUrlEncoded
    @POST("upload.php")
    suspend fun enviarImage(

        @Field("idImage") idImage: String,
        @Field("namImage") namImage: String,
        @Field("image") image: String,
    ):Response<String>



}