package com.example.superheroes.services


     import com.example.superheroes.data.SuperheroResponse
     import retrofit2.http.GET
     import retrofit2.http.Path

interface SuperheroService{

    @GET ("search/{name}")
    suspend fun findSuperheroesByName(@Path("name") query: String) : SuperheroResponse

    //@Get ("{character-id}")
    //suspend fun findSuperheroesById(@Path("character-id") id: string) Superhero

    @GET ("character-id}")
    suspend fun findSuperheroesById(@Path("character-id") id: String) : fichaSuperHeroe
}