package br.com.kid.service;

import br.com.kid.domain.Categoria;
import br.com.kid.dto.CategoriaDto;
import br.com.kid.dto.parser.CategoriaParser;
import br.com.kid.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService extends PadraoDTOServico<Categoria, Short, CategoriaDto, CategoriaRepository, CategoriaParser> {

    public CategoriaService(CategoriaRepository repository, CategoriaParser conversor) {
        super(repository, conversor);
    }
}
