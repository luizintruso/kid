package br.com.kid.api;

import br.com.kid.domain.UF;
import br.com.kid.servece.UFService;
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
        ufService.salve(uf);
        return uf;
    }

}
