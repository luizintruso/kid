package br.com.kid.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.kid.domain.UF;
import br.com.kid.repository.UFRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UFService {
	
    private UFRepository ufRepositry;

    public List<UF> obterTodos() {
        return ufRepositry.findAll().stream().collect(Collectors.toList());
    }

    public void salvar(UF uf) {
        ufRepositry.save(uf);
    }

    public void deletar(Long id) {
        ufRepositry.deleteById(id);
    }
}
