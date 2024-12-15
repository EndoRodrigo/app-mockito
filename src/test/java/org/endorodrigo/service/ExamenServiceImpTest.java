package org.endorodrigo.service;

import org.endorodrigo.model.Examen;
import org.endorodrigo.repository.ExamenRepository;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ExamenServiceImpTest {

    @Test
    void findElemntForName() {
        List<Examen> datos = Arrays.asList(new Examen(5L, "MATEMATICAS"), new Examen(6L, "LENGUAJE"), new Examen(7L, "HISTORIA"));

        ExamenRepository repository = mock(ExamenRepository.class);
        ExamenService service = new ExamenServiceImp(repository);

        when(repository.findAll()).thenReturn(datos);
        Examen examen = service.findElemntForName("MATEMATICAS");
        assertNotNull(examen);
        assertEquals(5L,examen.getId());
        assertEquals("MATEMATICAS", examen.getName());
    }
}