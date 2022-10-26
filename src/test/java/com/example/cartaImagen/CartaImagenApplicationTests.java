package com.example.cartaImagen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.cartaImagen.controller.Tamano;
import com.example.cartaImagen.service.CartaService;

@SpringBootTest
class CartaImagenApplicationTests {
	@Autowired
	private CartaService cartaService;


	@Test
	void testImagenQuedaIgual() {
		Tamano tamanoImagen = new Tamano (2480, 3508);
		Tamano calculado = cartaService.ajustarTamano(tamanoImagen);
		assertEquals(tamanoImagen.getAlto(), calculado.getAlto());
		assertEquals(tamanoImagen.getAncho(), calculado.getAncho());

	}

	@Test
	void testImagenReduceAncho() {
		Tamano tamanoImagen = new Tamano (2480, 3800);
		Tamano calculado = cartaService.ajustarTamano(tamanoImagen);
		assertEquals(tamanoImagen.getAlto(), calculado.getAlto());
		assertEquals(3508, calculado.getAncho());
	}

	@Test
	void testImagenReduceAlto() {
		Tamano tamanoImagen = new Tamano (2500, 3508);
		Tamano calculado = cartaService.ajustarTamano(tamanoImagen);
		assertEquals(2480, calculado.getAlto());
		assertEquals(tamanoImagen.getAncho(), calculado.getAncho());
	}

	@Test
	void testImagenReduceAltoYAncho() {
		Tamano tamanoImagen = new Tamano (2800, 3600);
		Tamano calculado = cartaService.ajustarTamano(tamanoImagen);
		assertEquals(2480, calculado.getAlto());
		assertEquals(3508, calculado.getAncho());

	}

	@Test
	void testImagenQuedeIgual() {
	}
}
