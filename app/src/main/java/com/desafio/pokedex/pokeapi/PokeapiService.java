package com.desafio.pokedex.pokeapi;

import com.desafio.pokedex.models.PokemonResponse;

public interface PokeapiService {

    Call<PokemonResponse>getListPokemon();
}
