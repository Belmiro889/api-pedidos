package com.belmiro.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belmiro.pedidos.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
