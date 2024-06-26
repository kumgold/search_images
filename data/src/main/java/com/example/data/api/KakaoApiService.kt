package com.example.data.api

import com.example.data.data.SearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface KakaoApiService {
    @GET("search/image")
    suspend fun searchImages(
        @Query("query") query: String,
        @Query("page") page: Int
    ): SearchResponse
}