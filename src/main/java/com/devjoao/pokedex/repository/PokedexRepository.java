package com.devjoao.pokedex.repository;

import com.devjoao.pokedex.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

//todos metodos do mongo db
public interface PokedexRepository extends ReactiveMongoRepository<Pokemon,String> { /*Classe pokemon*/


}
