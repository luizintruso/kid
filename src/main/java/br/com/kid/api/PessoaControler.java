package br.com.kid.api;

import br.com.kid.domain.Pessoa;
import br.com.kid.service.PessoaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
@AllArgsConstructor
public class PessoaControler {

    private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> obterTodos() {
        return pessoaService.obterTodos();
    }

    @PostMapping
    public Pessoa salve(@RequestBody Pessoa pessoa) {
        pessoaService.salvar(pessoa);
        return pessoa;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        pessoaService.deletar(id);
    }

}
