package br.com.kid.servece;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

@SpringBootTest
@Profile("test")
class UFServeceTest {
    @Autowired
    private UFService ufServece;

    @Test
    void obterTodos() {
        ufServece.obterTodos().size();
    }
}