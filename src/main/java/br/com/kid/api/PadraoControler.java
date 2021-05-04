package br.com.kid.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.kid.service.PadraoService;

public interface PadraoControler<T, I> {

	PadraoService<T, I> getService();

	@PostMapping
	default T salvar(@RequestBody @Validated T t) {
		return getService().salvar(t);
	}

	@DeleteMapping("/{id}")
	
	default void deletar(@PathVariable I i) {
		getService().deletar(i);
	}

	@PutMapping
	default T alterar(@RequestBody T t, @PathVariable @Validated I i) {
		return getService().alterar(t);
	}
	
	@GetMapping("/page")
	default Page<T> obterPaginado(Pageable pageable,T domain) {
		return getService().obterPaginado(pageable, domain);
	}

}
