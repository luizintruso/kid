package br.com.kid.dto.parser;


import br.com.kid.domain.Categoria;
import br.com.kid.dto.CategoriaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CategoriaParser extends PadraoParser<CategoriaDto, Categoria> {

    @Mapping(source = "idCategoriaPai", target = "categoriaPai.id")
    Categoria toDomain(CategoriaDto dto);

    @Mapping(source = "idCategoriaPai", target = "categoriaPai.id")
    void toDomain(CategoriaDto dto, @MappingTarget Categoria domain);


    @Mapping(source = "categoriaPai.id", target = "idCategoriaPai")
    CategoriaDto toDto(Categoria dto);

}
