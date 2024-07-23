package org.productos.java.productos2826502.services;

import java.util.List;

import org.productos.java.productos2826502.entities.Product;
import org.productos.java.productos2826502.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    //inyectar la dependencia 
    //al repositorio
    private ProductRepository repository
            = new ProductRepository();

    //operaciones de logica de negocio
   // casos de uso; historiad de usuario 
   //requerimientos fincionales
   
   public List<Product> findAllProducts(){
    return repository.finAll();
   }
}
