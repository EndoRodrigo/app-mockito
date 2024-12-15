package org.endorodrigo.service;

import org.endorodrigo.model.Examen;
import org.endorodrigo.repository.ExamenRepository;

import java.util.Optional;

public class ExamenServiceImp implements ExamenService{
    private ExamenRepository examenRepository;

    public ExamenServiceImp(ExamenRepository examenRepository) {
        this.examenRepository = examenRepository;
    }

    @Override
    public Examen findElemntForName(String name) {
        Optional<Examen> examenOptional = examenRepository.findAll().stream().filter(e -> e.getName().equals(name))
                .findFirst();
        Examen examen = null;
        if (examenOptional.isPresent()) {
            examen = examenOptional.orElseThrow();
        }
        return examen;
    }
}
