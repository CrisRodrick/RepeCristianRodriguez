package com.example.repechajecristianrodriguez.Model.Remote

import com.example.repechajecristianrodriguez.Model.Remote.FromInternet.RemoteDetails
import com.example.repechajecristianrodriguez.Model.Remote.FromInternet.RemoteList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

//modificar "conciertos" en cada GET por lo que venga en la API de la prueba

interface RemoteApi {

    @GET("conciertos")
    suspend fun fetchRemoteList(): Response<List<RemoteList>>



    @GET("conciertos/{id}")
    suspend fun fetchRemoteDetail(@Path("id") id: Int) : Response<RemoteDetails>
}