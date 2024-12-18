package org.endorodrigo.service;

import org.endorodrigo.model.Examen;

import java.util.Optional;

public interface ExamenService {

    Optional<Examen> findElemntForName(String name);
    Examen findexamenForPreguntas(String name);
    Examen guardar(Examen examen);
}
