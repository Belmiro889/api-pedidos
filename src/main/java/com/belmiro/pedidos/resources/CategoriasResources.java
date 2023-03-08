package com.belmiro.pedidos.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.belmiro.pedidos.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriasResources {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {

		List<Categoria> list = new ArrayList<Categoria>();
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritorio");

		list.add(cat1);
		list.add(cat2);

		return list;

	}
}
