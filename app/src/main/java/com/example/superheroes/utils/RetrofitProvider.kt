package com.example.superheroes.utils

import com.example.superheroes.data.tokenSuperheroe
import com.example.superheroes.services.SuperheroService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitProvider {
    companion object {
        fun getRetrofit(): SuperheroService {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://superheroapi.com/api/${tokenSuperheroe}/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(SuperheroService::class.java)
        }

    }
}

