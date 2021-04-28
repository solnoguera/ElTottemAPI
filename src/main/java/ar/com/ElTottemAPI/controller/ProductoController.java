package ar.com.ElTottemAPI.controller;

import ar.com.ElTottemAPI.model.Producto;
import ar.com.ElTottemAPI.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/producto")

public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping("/todos/")
    public ArrayList<Producto> obtenerProductos(){
        return productoService.getProductos();
    }

    @GetMapping("/{id}")
    public Optional<Producto> getById(@PathVariable("id") Long id){
        return productoService.getById(id);
    }

    @PostMapping("/nuevo")
    public void agregar(@RequestBody Producto prod){
        productoService.agregar(prod);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Long id){
        productoService.eliminar(id);
    }

}
