package com.example.cartaImagen.service.impl;


import org.springframework.stereotype.Service;

import com.example.cartaImagen.controller.Tamano;
import com.example.cartaImagen.service.CartaService;

@Service
public class CartaImpl implements CartaService {
    private Tamano tamanoHoja = new Tamano (2480, 3508);

    @Override

    public Tamano ajustarTamano (Tamano tamanoImagen) {
        if (tamanoImagen.getAlto() > tamanoHoja.getAlto() ){
            tamanoImagen.setAlto(tamanoHoja.getAlto()); 
        }
        if (tamanoImagen.getAncho() > tamanoHoja.getAncho() ){
            tamanoImagen.setAncho(tamanoHoja.getAncho()); 
        }
        return tamanoImagen;
    }
    
}
