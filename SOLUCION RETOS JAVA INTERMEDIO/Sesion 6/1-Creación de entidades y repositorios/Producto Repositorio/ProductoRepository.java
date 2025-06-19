package com.bedu.inventario;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Esta interfaz extiende JpaRepository para gestionar operaciones CRUD sobre la entidad Producto
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // Método personalizado que busca productos cuyo nombre contenga un texto específico (no sensible a mayúsculas)
    List<Producto> findByNombreContaining(String nombre);

    List<Producto> findByPrecioGreaterThan(double precio);
    List<Producto> findByNombreContainingIgnoreCase(String nombre);
    List<Producto> findByPrecioBetween(double min, double max);
    List<Producto> findByNombreStartingWithIgnoreCase(String prefijo);

    
    public interface ProductoRepository extends JpaRepository<Producto, Long> {

        // Encontrar productos con precio mayor a un valor
        List<Producto> findByPrecioGreaterThan(double precio);

        // Encontrar productos que contengan un fragmento en su nombre
        List<Producto> findByNombreContainingIgnoreCase(String nombre);

        // Encontrar productos con precio entre un rango
        List<Producto> findByPrecioBetween(double min, double max);

        // Encontrar productos cuyo nombre comienza con un prefijo
        List<Producto> findByNombreStartingWithIgnoreCase(String prefijo);
    }

}
