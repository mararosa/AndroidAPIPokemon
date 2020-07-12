package com.desafio.pokedex.pokeapi;

import com.desafio.pokedex.models.PokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonResponse> getListPokemon();
}
