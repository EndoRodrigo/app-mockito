package org.endorodrigo.service;

import org.endorodrigo.model.Examen;
import org.endorodrigo.repository.ExamenRepository;
import org.endorodrigo.repository.PreguntasRepository;

import java.util.List;
import java.util.Optional;

public class ExamenServiceImp implements ExamenService{
    private ExamenRepository examenRepository;
    private PreguntasRepository preguntasRepository;

    public ExamenServiceImp(ExamenRepository examenRepository, PreguntasRepository preguntaRepository) {
        this.examenRepository = examenRepository;
        this.preguntasRepository =  preguntaRepository;
    }

    @Override
    public Optional<Examen> findElemntForName(String name) {
        return examenRepository.findAll().stream().filter(e -> e.getName().equals(name))
                .findFirst();

    }

    @Override
    public Examen findexamenForPreguntas(String name) {
        Optional<Examen> examenOptional = findElemntForName(name);
        Examen exa = null;
        if (examenOptional.isPresent()) {
            exa = examenOptional.orElseThrow();
            List<String> preguntas = preguntasRepository.findPreguntasporExamen(exa.getId());
            exa.setPreguntas(preguntas);
        }
        return exa;
    }
}
