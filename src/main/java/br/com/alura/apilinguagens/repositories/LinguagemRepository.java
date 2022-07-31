package br.com.alura.apilinguagens.repositories;

import br.com.alura.apilinguagens.domain.Linguagem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinguagemRepository extends MongoRepository<Linguagem, String> {
}
