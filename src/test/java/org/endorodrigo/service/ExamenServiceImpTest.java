package org.endorodrigo.service;

import org.endorodrigo.model.Examen;
import org.endorodrigo.repository.ExamenRepository;
import org.endorodrigo.repository.ExamenRepositoryOtros;
import org.endorodrigo.repository.PreguntasRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ExamenServiceImpTest {

    ExamenRepository repository;
    ExamenService service;
    PreguntasRepository preguntasRepository;

    @BeforeEach
    void setUp() {
        repository = mock(ExamenRepository.class);
        preguntasRepository = mock(PreguntasRepository.class);
        service = new ExamenServiceImp(repository, preguntasRepository);
    }

    @Test
    void findElemntForName() {

        when(repository.findAll()).thenReturn(Datos.datos);
        Optional<Examen> examen = service.findElemntForName("MATEMATICAS");
        assertNotNull(examen);
        assertEquals(5L, examen.get().getId());
        assertEquals("MATEMATICAS", examen.get().getName());
    }

    @Test
    void findElemntForNamelistNull() {
        List<Examen> datos = Collections.emptyList();

        when(repository.findAll()).thenReturn(datos);
        Optional<Examen> examen = service.findElemntForName("MATEMATICAS");
        assertNotNull(examen.isPresent());
    }

    @Test
    void testPreguntasForExamen() {
        when(repository.findAll()).thenReturn(Datos.datos);
        when(preguntasRepository.findPreguntasporExamen(5L)).thenReturn(Datos.preguntas);
        Examen examen = service.findexamenForPreguntas("MATEMATICAS");
        assertEquals(4, examen.getPreguntas().size());
        assertTrue(examen.getPreguntas().contains("aritmetica"));
    }

    @Test
    void testPreguntasForExamenVerity() {
        when(repository.findAll()).thenReturn(Datos.datos);
        when(preguntasRepository.findPreguntasporExamen(5L)).thenReturn(Datos.preguntas);
        Examen examen = service.findexamenForPreguntas("MATEMATICAS");
        assertEquals(4, examen.getPreguntas().size());
        assertTrue(examen.getPreguntas().contains("aritmetica"));
        verify(repository).findAll();
        verify(preguntasRepository).findPreguntasporExamen(5L);
    }
}