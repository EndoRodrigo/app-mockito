package org.endorodrigo.repository;

import org.endorodrigo.model.Examen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExamenRepositoryImp implements ExamenRepository{


    @Override
    public List<Examen> findAll() {
        return Arrays.asList(new Examen(5L, "MATEMATICAS"), new Examen(6L, "LENGUAJE"), new Examen(7L, "HISTORIA"));
    }
}
