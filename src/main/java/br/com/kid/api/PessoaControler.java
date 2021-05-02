package br.com.kid.api;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kid.domain.Pessoa;
import br.com.kid.dto.PessoaDTO;
import br.com.kid.dto.PessoaFisicaDTO;
import br.com.kid.dto.parser.EnderecoParser;
import br.com.kid.dto.parser.PessoaParser;
import br.com.kid.service.PessoaService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/pessoas")
@AllArgsConstructor
@Slf4j
public class PessoaControler {

    private PessoaService pessoaService;
	
	@Autowired
	private PessoaParser parser;
	
	@Autowired
	private EnderecoParser parserEndereco;
	
    @GetMapping
    public List<Pessoa> obterTodos() {
        return pessoaService.obterTodos();
    }

    @PostMapping
    public PessoaDTO salve(@RequestBody PessoaDTO pessoa) {
    log.info(pessoa.getEmail());
    if(pessoa instanceof PessoaFisicaDTO) {
    	parser.toDaomin((PessoaFisicaDTO)pessoa);
    }
    //        pessoaService.salvar(pessoa);
    pessoa.getEnderecos().stream().map(e-> parserEndereco.toDaomin(e)).collect(Collectors.toList());
    
    return pessoa;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        pessoaService.deletar(id);
    }

}
