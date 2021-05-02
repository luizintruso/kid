package br.com.kid.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

@SpringBootTest
@Profile("test")
class PessoaServiceTest {
    @Autowired
    private PessoaService service;

    @Test
    void obterTodos() {
     System.out.println(service.obterTodos());
    }
}