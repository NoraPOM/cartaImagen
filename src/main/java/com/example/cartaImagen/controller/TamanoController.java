package com.example.cartaImagen.controller;

import com.example.cartaImagen.service.CartaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/Tamano" )

public class TamanoController {
    private final CartaService cartaService;

    public TamanoController( @Autowired CartaService x)
    {
        this.cartaService = x;
    }

    @PostMapping
    public ResponseEntity<Tamano> create(@RequestBody Tamano tamano){
        System.out.println("Primera persona del cambio Andrea");
        System.out.println("Segunda persona del cambio Marce");
        System.out.println("Tercera persona del cambio Ana");
        System.out.println("Cuarta persona del cambio Norita");
        return ResponseEntity.ok(cartaService.ajustarTamano(tamano));
    }
}
