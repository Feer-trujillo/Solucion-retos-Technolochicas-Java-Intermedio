package com.bedu.Inventario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ProductoRepository repository) {
		return (args) -> {
			// Guardar algunos productos
			repository.save(new Producto("Laptop", "Portátil de 16 pulgadas", 1200.00));
			repository.save(new Producto("Teclado mecánico", "Switch azul", 800.00));
			repository.save(new Producto("Mouse gamer", "Alta precisión", 600.00));

			// Mostrar todos los productos
			System.out.println("📂 Productos disponibles:");
			repository.findAll().forEach(System.out.println);

			// Buscar por nombre parcial
			System.out.println("\n🔍 Productos que contienen 'Lap':");
			repository.findByNombreContaining("Lap").forEach(System.out.println);
		};
	}
}