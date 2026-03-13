package com.ejemploreservas.reservas.controller;

import com.ejemploreservas.reservas.model.Reserva;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    private List<Reserva> listaReservas = new ArrayList<>();
    private Long generadorId = 1L;

    @GetMapping
    public List<Reserva> obtenerTodasLasReservas() {
        return listaReservas;
    }

    @PostMapping
    public Reserva crearReserva(@RequestBody Reserva nuevaReserva) {
        nuevaReserva.setId(generadorId++);
        listaReservas.add(nuevaReserva);
        return nuevaReserva;
    }

    @GetMapping("/cancha/{canchaId}")
    public List<Reserva> obtenerReservasPorCancha(@PathVariable Long canchaId) {
        return listaReservas.stream()
                .filter(reserva -> reserva.getCanchaId().equals(canchaId))
                .collect(Collectors.toList());
    }
}