package br.com.kid.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.kid.domain.UF;
import br.com.kid.repository.UFRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UFService implements PadraoService<UF, Long> {
	
    private UFRepository ufRepository;

    public List<UF> obterTodos() {
        return ufRepository.findAll().stream().collect(Collectors.toList());
    }

	@Override
	public UFRepository getRepository() {
		return ufRepository;
	}

}
