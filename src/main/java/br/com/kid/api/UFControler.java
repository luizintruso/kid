package br.com.kid.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kid.domain.UF;
import br.com.kid.service.UFService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/ufs")
@AllArgsConstructor
public class UFControler {

    private UFService ufService;

    @GetMapping
    public List<UF> obterTodos() {
        return ufService.obterTodos();
        
    }

    @PostMapping
    public UF salve(@RequestBody UF uf) {
        ufService.salvar(uf);
        return uf;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ufService.deletar(id);
    }

}
