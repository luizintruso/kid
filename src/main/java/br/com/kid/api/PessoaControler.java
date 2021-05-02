package br.com.kid.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kid.domain.Pessoa;
import br.com.kid.service.PessoaService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/pessoas")
@AllArgsConstructor
public class PessoaControler {

	@Autowired
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
