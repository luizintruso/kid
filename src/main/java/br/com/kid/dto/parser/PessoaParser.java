package br.com.kid.dto.parser;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.kid.domain.Pessoa;
import br.com.kid.domain.PessoaFisica;
import br.com.kid.domain.PessoaJuridica;
import br.com.kid.dto.PessoaDTO;
import br.com.kid.dto.PessoaFisicaDTO;
import br.com.kid.dto.PessoaJuridicaDTO;


@Mapper(componentModel = "spring")
public interface PessoaParser {
	
	PessoaFisica toDaomin(PessoaFisicaDTO dto);
	
	PessoaJuridica toDaomin(PessoaJuridicaDTO dto);
	
	PessoaDTO toDto(Pessoa pessoa);
	
	@Mapping(source = "endereco.pessoa.id",target = "endereco.idPessoa")
	PessoaFisicaDTO toDTOPessoaFisica(PessoaFisica pessoaFisica);
	
	List<PessoaDTO> parseListDTO(List<Pessoa> listaPessoa);

}
