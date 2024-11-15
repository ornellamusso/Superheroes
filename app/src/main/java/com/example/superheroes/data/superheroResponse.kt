package com.example.superheroes.data

import com.google.gson.annotations.SerializedName

data class SuperheroResponse (
    @SerializedName ("response") val response: String,
    @SerializedName ("results-for") val resultsFor: String,
    @SerializedName ("results") val results: List<Superhero>
)
{}

data class Superhero(
    @SerializedName ("id") val id: String,
    @SerializedName ("name") val name: String,
    @SerializedName ("image") val image: Image,
){}
data class Image (
    @SerializedName ("url") val url: String,
) { }
