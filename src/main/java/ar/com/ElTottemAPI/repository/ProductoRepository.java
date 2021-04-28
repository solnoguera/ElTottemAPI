package ar.com.ElTottemAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ar.com.ElTottemAPI.model.Producto;

import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository <Producto, Long> {

    public abstract Optional<Producto> getById(Long id);

}
