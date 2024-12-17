package org.endorodrigo.service;

import org.endorodrigo.model.Examen;
import org.endorodrigo.repository.PreguntasRepository;

import java.util.Arrays;
import java.util.List;

public class Datos {
    public final static List<Examen> datos = Arrays.asList(
            new Examen(5L, "MATEMATICAS"),
            new Examen(6L, "LENGUAJE"),
            new Examen(7L, "HISTORIA"));

    public final static List<String> preguntas = Arrays.asList(
            "aritmetica",
            "integrales",
            "derivadas",
            "geometria"
            );

}
