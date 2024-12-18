package org.endorodrigo.repository;

import org.endorodrigo.model.Examen;

import java.util.List;

public interface ExamenRepository {
    Examen guardar(Examen examen);
    List<Examen> findAll();
}
