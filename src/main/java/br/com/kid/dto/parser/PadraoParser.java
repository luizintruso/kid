package br.com.kid.dto.parser;

import br.com.kid.dto.DTOPadrao;
import org.mapstruct.MappingTarget;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.List;
import java.util.stream.Collectors;

public interface PadraoParser<T extends DTOPadrao<?>, D> {
    T toDto(D domain);

    void toDomain(T dto, @MappingTarget D domain);

    D toDomain(T dto);

    default List<T> toDto(List<D> domains) {
        final List<T> dtos = domains.stream().map(this::toDto).collect(Collectors.toList());
        return dtos;
    }

    default Page<T> toDtoPage(Page<D> pageDomain) {
        final List<T> dtos = toDto(pageDomain.getContent());
        final PageImpl page = new PageImpl<>(dtos, pageDomain.getPageable(),pageDomain.getTotalElements());
        return page;
    }
}
