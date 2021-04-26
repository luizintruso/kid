package br.com.kid.servece;

import br.com.kid.domain.UF;
import br.com.kid.repository.UFRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UFService {
    private UFRepository ufRepositry;


    public List<UF> obterTodos() {
        return ufRepositry.findAll().stream().collect(Collectors.toList());
    }

    public void salve(UF uf) {
        ufRepositry.save(uf);
    }

}
