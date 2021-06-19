package br.com.kid.api;

import br.com.kid.dto.CategoriaDto;
import br.com.kid.service.CategoriaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaControler extends PadraoDtoController<Short, CategoriaDto, CategoriaService> {

    public CategoriaControler(CategoriaService servico) {
        super(servico);
    }
}
