package br.com.kid.dto.parser;

import org.mapstruct.Mapper;

import br.com.kid.domain.Pessoa;
import br.com.kid.dto.PessoaFisicaDTO;


@Mapper(componentModel = "spring")
public interface PessoaParser {
	
	Pessoa toDaomin(PessoaFisicaDTO dto);

}
