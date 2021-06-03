package com.accoladecreative.mydailydiary.network

import com.accoladecreative.mydailydiary.database.Event
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query


private const val BASE_URL = "https://jsonplaceholder.typicode.com"
private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        //.addConverterFactory()
        //.addConverterFactory(GsonConverterFactory.create)
        .build()



interface APIConn{
    @GET("post/1")
    suspend fun getDetails(): Call<Event>

    @GET("post/21")
    suspend fun getOthers(
            @Query("id") id:String,
            @Query("title") title:String,
            @Query("details") detail:String,
            @Query("date") date:String
    ): Event

    @GET("post/1")
    suspend fun getFullList(): List<Event>




}


    val APIService: APIConn by lazy {
        retrofit.create(APIConn::class.java)
    }




//"https://www.accoladecreativetechs.com"
//retrofit api