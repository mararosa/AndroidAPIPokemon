package com.desafio.pokedex.pokeapi;

import com.desafio.pokedex.models.PokemonResponse;

import retrofit2.Call;

public interface PokeapiService {

    Call<PokemonResponse> getListPokemon();
}
