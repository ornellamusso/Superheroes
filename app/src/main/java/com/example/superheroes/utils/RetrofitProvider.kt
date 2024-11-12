package com.example.superheroes.utils

import com.example.superheroes.data.tokenSuperheroe
import retrofit2.Converter
import retrofit2.Retrofit

class SuperheroeService {

}

class GsonCoverterFactory {
    companion object {
        fun create() {
        }
    }

}

class RetrofitProvider {
    companion object {
        fun getRetrofit(): SuperheroeService {
            val retrofit = Retrofit.Builder()
                .baseUrl("http://superheroapi.com/api/${tokenSuperheroe}/")
                .addConverterFactory(GsonCoverterFactory.create())
                .build()

            return retrofit.create(SuperheroService::class.java.())
        }

    }
}

