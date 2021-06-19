package br.com.kid.service;

import br.com.kid.domain.Categoria;
import br.com.kid.domain.message.Message;
import br.com.kid.dto.CategoriaDto;
import br.com.kid.dto.parser.CategoriaParser;
import br.com.kid.exception.DomainException;
import br.com.kid.repository.CategoriaRepository;
import lombok.SneakyThrows;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService extends PadraoDTOServico<Categoria, Short, CategoriaDto, CategoriaRepository, CategoriaParser> {

    public CategoriaService(CategoriaRepository repository, CategoriaParser conversor) {
        super(repository, conversor);
    }

    @SneakyThrows
    public Page<CategoriaDto> consultarFilhos(Short id, Pageable pageable) {
        Categoria categoria = repository.findById(id).orElseThrow(() -> new DomainException(Message.ENTIDADE_NAO_ENCONTRADA));
        return this.conversor.toDtoPage(repository.findByCategoriaPai(categoria, pageable));
    }
}
