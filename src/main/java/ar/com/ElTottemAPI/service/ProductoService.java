package ar.com.ElTottemAPI.service;

import ar.com.ElTottemAPI.model.Producto;
import ar.com.ElTottemAPI.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public ArrayList<Producto> getProductos(){
        return (ArrayList<Producto>) productoRepository.findAll();
    }

    public Optional<Producto> getById(Long id){
        return productoRepository.getById(id);
    }

    public void agregar(Producto prod){
        productoRepository.save(prod);
    }

    public void eliminar(Long id){
        productoRepository.deleteById(id);
    }

}
