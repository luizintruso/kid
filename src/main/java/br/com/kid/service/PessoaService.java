package br.com.kid.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.kid.domain.Pessoa;
import br.com.kid.repository.EnderecoRepository;
import br.com.kid.repository.PessoaRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PessoaService {
	
    private PessoaRepository pessoaRepository;
    private EnderecoRepository enderecoRepository;

    public List<Pessoa> obterTodos() {
        return pessoaRepository.findAll().stream().collect(Collectors.toList());
    }

    public void salvar(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }

    public void deletar(Long id) {
        pessoaRepository.deleteById(id);
    }

	public Pessoa obter(Long id) {
		return pessoaRepository.findById(id).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
	}
}
