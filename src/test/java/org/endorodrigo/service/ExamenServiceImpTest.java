package org.endorodrigo.service;

import org.endorodrigo.model.Examen;
import org.endorodrigo.repository.ExamenRepository;
import org.endorodrigo.repository.ExamenRepositoryOtros;
import org.endorodrigo.repository.PreguntasRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ExamenServiceImpTest {

    @Mock
    ExamenRepository repository;
    @InjectMocks
    ExamenServiceImp service;

    @Mock
    PreguntasRepository preguntasRepository;

    /* @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        repository = mock(ExamenRepository.class);
        preguntasRepository = mock(PreguntasRepository.class);
        service = new ExamenServiceImp(repository, preguntasRepository);
    }*/

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

    @Test
    void testGuaradarExamen() {
        when(repository.guardar(any(Examen.class))).thenReturn(Datos.examen);
        Examen examen = service.guardar(Datos.examen);
        assertNotNull(examen.getId());
        assertEquals(8L, examen.getId());
        assertEquals("Fisica", examen.getName());
    }
}