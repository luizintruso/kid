package br.com.kid.dto.parser;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.kid.domain.Endereco;
import br.com.kid.dto.EnderecoDTO;

@Mapper(componentModel = "spring")
public interface EnderecoParser {
	@Mapping(source = "idUf",target = "uf.id")
	Endereco toDaomin(EnderecoDTO dto);

}
