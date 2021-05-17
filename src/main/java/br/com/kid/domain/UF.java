package br.com.kid.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "uf")
public class UF {

    @Id
    @Column(name="id", insertable=true, updatable=true, unique=true, nullable=false)
    private Long id;

    @NotNull(message = "Nome UF obrigatório!")
    @Column(name = "nome")
    private String nome;

    @NotNull(message = "Sigla UF obrigatório!")
    @Size(min = 2,max = 2,message = "A sigla não pode passar de rdois camdpos!")
    @Column(name = "sigla")
    private String sigla;

}
