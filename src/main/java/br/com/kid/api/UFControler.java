package br.com.kid.api;

import br.com.kid.domain.UF;
import br.com.kid.service.UFService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
