package br.com.kid.dto.parser;

import org.mapstruct.Mapper;

import br.com.kid.domain.PessoaFisica;
import br.com.kid.dto.PessoaFisicaDTO;

@Mapper(componentModel = "spring")
public interface PessoaParser {
	
	PessoaFisica toDaomin(PessoaFisicaDTO dto);

}
