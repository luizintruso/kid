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
import br.com.kid.domain.PessoaFisica;
import br.com.kid.dto.PessoaDTO;
import br.com.kid.dto.PessoaFisicaDTO;
import br.com.kid.dto.PessoaJuridicaDTO;
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

	@Autowired
	private PessoaService pessoaService;

	@Autowired
	private PessoaParser pessoaParser;

	@Autowired
	private EnderecoParser parserEndereco;

	@GetMapping
	public List<PessoaDTO> obterTodos() {
		return pessoaParser.parseListDTO(pessoaService.obterTodos());
	}

	@PostMapping
	public PessoaDTO salvar(@RequestBody PessoaDTO pessoaDTO) {

		Pessoa pessoa;
		if (pessoaDTO instanceof PessoaFisicaDTO) {
			pessoa = pessoaParser.toDaomin((PessoaFisicaDTO) pessoaDTO);
		} else {
			pessoa = pessoaParser.toDaomin((PessoaJuridicaDTO) pessoaDTO);
		}

		pessoa.setEndereco(parserEndereco.toDaomin(pessoaDTO.getEndereco()));
		pessoa.getEndereco().setPessoa(pessoa);

		pessoaService.salvar(pessoa);

		return pessoaParser.toDto(pessoa);
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		pessoaService.deletar(id);
	}
	
	@GetMapping("/{id}")
	public PessoaDTO obter(@PathVariable Long id) {
		
		Pessoa pessoa = pessoaService.obter(id);
		PessoaDTO pessoaDTO = null;
		if(pessoa instanceof PessoaFisica) {
			pessoaDTO = pessoaParser.toDTOPessoaFisica((PessoaFisica)pessoa);
		}

		return pessoaDTO;
	}

}
