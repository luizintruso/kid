package br.com.kid.service;

import br.com.kid.domain.Pessoa;
import br.com.kid.repository.EnderecoRepository;
import br.com.kid.repository.PessoaRepository;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
}
