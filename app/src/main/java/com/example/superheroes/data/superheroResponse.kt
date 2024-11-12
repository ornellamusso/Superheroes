package com.example.superheroes.data


import com.google.gson.annotations.SerializedName

data class SuperheroResponse(
    @SerializedName ("response") val response: String,
    @SerializedName ("result-for") val resultFor: String,
    @SerializedName ("results") val resolts: List<Superhero>,)

{}

data class Superhero(
    @SerializedName ("id") val id: String,
    @SerializedName ("name") val name: String,

)
{}