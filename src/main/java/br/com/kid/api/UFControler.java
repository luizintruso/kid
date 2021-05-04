package br.com.kid.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kid.domain.UF;
import br.com.kid.service.UFService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/ufs")
@AllArgsConstructor
public class UFControler implements PadraoControler<UF, Long>{

    private UFService ufService;
    
	@Override
	public UFService getService() {
		return ufService;
	}

    @GetMapping
    public List<UF> obterTodos() {
        return ufService.obterTodos();
        
    }

}
