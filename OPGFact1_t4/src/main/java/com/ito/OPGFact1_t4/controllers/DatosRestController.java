package com.ito.OPGFact1_t4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

@RestController
public class DatosRestController {

    // Información de una lista retornada como JSON
    @GetMapping("/api/materias")
    public Map<String, Object> obtenerMaterias() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("estudiante", "Gael Fernando Ortíz Pérez");
        respuesta.put("semestre", 7);
        respuesta.put("materias", Arrays.asList(
                "Gestión de Proyectos de Software",
                "Administración de Redes",
                "Programación Web",
                "Taller de Investigación 1",
                "Sistemas Programables",
                "Programación Lógica y Funcional"));

        return respuesta;
    }
}