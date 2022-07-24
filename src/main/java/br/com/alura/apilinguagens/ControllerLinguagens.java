package br.com.alura.apilinguagens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerLinguagens {

    @Autowired
    private LinguagemRepository repositorio;

    @GetMapping("/linguagens")
    public List<Linguagem> linguagens(){
        List<Linguagem> linguagens = repositorio.findAll();
        return linguagens;
    }



}
