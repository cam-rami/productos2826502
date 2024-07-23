package org.productos.java.productos2826502.controllers;

import java.util.List;

import org.productos.java.productos2826502.entities.Product;
import org.productos.java.productos2826502.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/products")
public class ProductControllen {

    //inyectar el servicio
    private ProductService service =
    new ProductService();

    //primer endpoint
    //Endpoint: un metodo controlador 

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola ... 28262502";
    }

    //Segundo endpoint
    //Get: Obtener informacion SIN ALTERARLA
    //    (inmutable)
    @GetMapping
    public List<Product>findAllProducts(){
        //ultimo el servicio
        return service.findAllProducts();

    }
    
}
