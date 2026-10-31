/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdelivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import smartdelivery.model.Comercio;
import smartdelivery.repository.ComercioRepository;

import java.util.List;

@RestController
@RequestMapping("/api/comercios")
public class ComercioController {

    @Autowired
    private ComercioRepository comercioRepository;

    @GetMapping
    public List<Comercio> obtenerTodos() {
        return comercioRepository.findAll();
    }

    @PostMapping
    public Comercio crearComercio(@RequestBody Comercio comercio) {
        if (comercio.getCalificacion() == null) comercio.setCalificacion(5.0);
        if (comercio.getTiempoEntrega() == null || comercio.getTiempoEntrega().isEmpty()) comercio.setTiempoEntrega("20-40 min");
        if (comercio.getCostoEnvio() == null || comercio.getCostoEnvio().isEmpty()) comercio.setCostoEnvio("Gratis");
        if (comercio.getLogoUrl() == null || comercio.getLogoUrl().isEmpty()) comercio.setLogoUrl("https://images.unsplash.com/photo-1517248135467-4c7edcad34c4?w=200");
        return comercioRepository.save(comercio);
    }
}