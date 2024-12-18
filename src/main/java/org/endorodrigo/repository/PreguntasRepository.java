package org.endorodrigo.repository;

import java.util.List;

public interface PreguntasRepository {

    List<String> findPreguntasporExamen(Long id);
    void guardarVariasPreguntas(List<String> preguntas);
}
