package pl.futuredev.helloworldkotlin.api

import pl.futuredev.helloworldkotlin.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

interface PhotoAPI {

    @GET("?key=<your_key>&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}