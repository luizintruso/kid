package br.com.kid.dto;

import lombok.Data;

@Data
public class CategoriaDto implements DTOPadrao<Short> {

    private Short id;

    private String nome;

    private Short idCategoriaPai;

    private String sigla;
}
