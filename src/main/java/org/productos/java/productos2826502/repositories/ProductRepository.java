package org.productos.java.productos2826502.repositories;

import java.util.List;

import org.productos.java.productos2826502.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    //lista de un repository 
    //debe ser inmutable
    //la alogica de negocio no modifica
    List<Product> producto = List.of(
        Product.builder()
        .id(1L)
        .nombre("Silla Reclinable")
        .precio(345000.0)
        .build()
        ,
    new Product(2L,
                "Escritorio",
                2000000.0)
    );
        
    //Metodo(comportamiento)para consultar todos 
    //los productos del repository
    public List<Product> finAll(){
        return this.producto;
    }
    }
