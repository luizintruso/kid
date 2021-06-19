package br.com.kid.service;

import br.com.kid.domain.message.Message;
import br.com.kid.dto.DTOPadrao;
import br.com.kid.dto.parser.PadraoParser;
import br.com.kid.exception.DomainException;
import lombok.SneakyThrows;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.Optional;

public abstract class PadraoDTOServico<D, I extends Serializable, T extends DTOPadrao<I>, R extends JpaRepository<D, I>, P extends PadraoParser<T, D>> {

    private final R repository;
    private final P conversor;

    public PadraoDTOServico(R repository, P conversor) {
        this.repository = repository;
        this.conversor = conversor;
    }

    @SneakyThrows
    public T save(T dto) {
        final D domain = this.conversor.toDomain(dto);
        repository.save(domain);
        return this.conversor.toDto(domain);
    }

    @SneakyThrows
    public T update(T dto, I id) {
        final Optional<D> domainOpt = this.repository.findById(id);
        final D domain = domainOpt.orElseThrow(() -> new DomainException(Message.ENTIDADE_NAO_ENCONTRADA));
        this.conversor.toDomain(dto, domain);
        this.repository.save(domain);
        return dto;
    }

    @SneakyThrows
    public T update(T dto) {
        final Optional<D> domainOpt = this.repository.findById(dto.getId());
        final D domain = domainOpt.orElseThrow(() -> new DomainException(Message.ENTIDADE_NAO_ENCONTRADA));
        this.conversor.toDomain(dto, domain);
        this.repository.save(domain);
        return dto;
    }

    @SneakyThrows
    public void delete(I id) {
        final Optional<D> domainOpt = this.repository.findById(id);
        this.repository.delete(domainOpt.orElseThrow(() -> new DomainException(Message.ENTIDADE_NAO_ENCONTRADA)));
    }
}
