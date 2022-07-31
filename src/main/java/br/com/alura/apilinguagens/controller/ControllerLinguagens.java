package br.com.alura.apilinguagens.controller;
import br.com.alura.apilinguagens.domain.Linguagem;
import br.com.alura.apilinguagens.repositories.LinguagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerLinguagens {

    @Autowired
    private LinguagemRepository linguagemRepository;

    @GetMapping("/linguagens")
    public List<Linguagem> linguagens(){
        return linguagemRepository.findAll();
    }



}
