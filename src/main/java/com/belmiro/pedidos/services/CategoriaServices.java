package com.belmiro.pedidos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.belmiro.pedidos.domain.Categoria;
import com.belmiro.pedidos.repositories.CategoriaRepository;
import com.belmiro.pedidos.services.exception.ValidationException;

@Service
public class CategoriaServices {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria buscar(Integer id) throws ValidationException {
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		return categoria.orElseThrow(() -> new ValidationException("Categoria não encontrada! Id: "
				.concat(String.valueOf(id)).concat(" Tipo: ").concat(Categoria.class.getName())));
		
	}

}
