package br.com.kid.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PadraoService<T, I> {

	JpaRepository<T, I> getRepository();

	default T salvar(T domain) {
		return getRepository().save(domain);
	}

	default T alterar(T domain) {
		return getRepository().save(domain);
	}

	default void deletar(I id) {
		getRepository().deleteById(id);
	}
	
	default Page<T> obterPaginado(Pageable pageable, T domain){
		return getRepository().findAll(pageable);
	}

}
