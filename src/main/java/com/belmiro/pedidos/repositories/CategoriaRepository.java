package com.belmiro.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belmiro.pedidos.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

	
}
