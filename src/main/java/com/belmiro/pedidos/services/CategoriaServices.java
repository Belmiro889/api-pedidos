package com.belmiro.pedidos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belmiro.pedidos.domain.Categoria;
import com.belmiro.pedidos.repositories.CategoriaRepository;

@Service
public class CategoriaServices {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria buscar(Integer id) {
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		return categoria.orElse(null);
	}

}
