package com.ejemploreservas.canchareservas.controller;

import com.ejemploreservas.canchareservas.model.Cancha;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/canchas")
public class CanchaController {

    private List<Cancha> listaCanchas = new ArrayList<>();
    private Long generadorId = 1L;

    @GetMapping
    public List<Cancha> obtenerTodasLasCanchas() {
        return listaCanchas;
    }
    @PostMapping
    public Cancha crearCancha(@RequestBody Cancha nuevaCancha) {
        nuevaCancha.setId(generadorId++);
        listaCanchas.add(nuevaCancha);
        return nuevaCancha;
    }
}