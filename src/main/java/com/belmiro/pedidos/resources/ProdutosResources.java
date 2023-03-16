package com.belmiro.pedidos.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belmiro.pedidos.domain.Produto;
import com.belmiro.pedidos.repositories.ProdutoRepository;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutosResources {

	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> buscar(@PathVariable Integer id) {

		Optional<Produto> produto = produtoRepository.findById(id);
		return ResponseEntity.ok().body(produto);
	}

}
