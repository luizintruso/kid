package br.com.kid.api;

import br.com.kid.dto.DTOPadrao;
import br.com.kid.service.PadraoDTOServico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;

public abstract class PadraoDtoController<I extends Serializable, T extends DTOPadrao<I>, S extends PadraoDTOServico<?, I, T, ?, ?>> {

    protected final S servico;

    public PadraoDtoController(S servico) {
        this.servico = servico;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public T save(@Validated @RequestBody T dto) {
        return this.servico.save(dto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public T update(@Validated @RequestBody T dto, @PathVariable("id") I id) {
        return this.servico.update(dto, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") I id) {
        this.servico.delete(id);
    }

    @GetMapping
    public Page<T> findPage(Pageable pageable) {
        return this.servico.findPage(pageable);
    }

}
