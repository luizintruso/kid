package br.com.kid.dto.parser;

import br.com.kid.dto.DTOPadrao;
import org.mapstruct.MappingTarget;

public interface PadraoParser<T extends DTOPadrao<?>, D> {
    T toDto(D domain);

    void toDomain(T dto, @MappingTarget D domain);

    D toDomain(T dto);
}
