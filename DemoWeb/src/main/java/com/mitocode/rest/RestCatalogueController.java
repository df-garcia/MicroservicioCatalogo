package com.mitocode.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.ProductoChiper;
import com.mitocode.repo.IProductoChiperRepo;

@RestController
@RequestMapping("/catalogo")
public class RestCatalogueController {

	@Autowired
	private IProductoChiperRepo repo;
	
	@GetMapping
	public List<ProductoChiper> listar(){
		return repo.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody ProductoChiper prod){
		repo.save(prod);
	}
	
	@PutMapping
	public void modificar(@RequestBody ProductoChiper prod){
		repo.save(prod);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") String id) {
		repo.deleteById(id);
	}

}
