package com.belmiro.pedidos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belmiro.pedidos.domain.Categoria;
import com.belmiro.pedidos.domain.Produto;
import com.belmiro.pedidos.repositories.CategoriaRepository;
import com.belmiro.pedidos.repositories.ProdutoRepository;

@SpringBootApplication
public class PedidosApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(PedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria categoria1 = new Categoria(null, "Informatica");
		Categoria categoria2 = new Categoria(null, "Escritorio");

		Produto produto1 = new Produto(null,"Computador",2000.00);
		Produto produto2 = new Produto(null,"Impressoura",800.00);
		Produto produto3 = new Produto(null,"Mouse",80.00);
		
		categoria1.getProdutos().addAll(Arrays.asList(produto1,produto2,produto3));
		categoria2.getProdutos().add(produto2);
		
		produto1.getCategorias().add(categoria1);
		produto2.getCategorias().addAll(Arrays.asList(categoria1,categoria2));
		produto3.getCategorias().add(categoria1);
		
		
		categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2));
		produtoRepository.saveAll(Arrays.asList(produto1,produto2, produto3));
	}

}
