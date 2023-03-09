package com.belmiro.pedidos.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.belmiro.pedidos.domain.Categoria;
import com.belmiro.pedidos.services.CategoriaServices;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriasResources {

	@Autowired
	private CategoriaServices categoriaServices;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		Categoria cat = categoriaServices.buscar(id);
		return ResponseEntity.ok().body(cat);
	}
}
