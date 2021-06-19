package br.com.kid.api;

import br.com.kid.dto.CategoriaDto;
import br.com.kid.service.CategoriaService;
import lombok.SneakyThrows;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaControler extends PadraoDtoController<Short, CategoriaDto, CategoriaService> {

    public CategoriaControler(CategoriaService servico) {
        super(servico);
    }


    @GetMapping(value = "/{id}/filhos")
    @SneakyThrows
    public Page<CategoriaDto> getChildrens(@PathVariable("id") Short id, Pageable pageable) {
        return servico.consultarFilhos(id, pageable);
    }
}
