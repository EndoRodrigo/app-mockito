package org.endorodrigo.service;

import org.endorodrigo.model.Examen;
import org.endorodrigo.repository.ExamenRepository;
import org.endorodrigo.repository.ExamenRepositoryImp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamenServiceImpTest {

    @Test
    void findElemntForName() {
        ExamenRepository repository = new ExamenRepositoryImp();
        ExamenService service = new ExamenServiceImp(repository);
        Examen examen = service.findElemntForName("MATEMATICAS");
        assertNotNull(examen);
        assertEquals(5L,examen.getId());
        assertEquals("MATEMATICAS", examen.getName());
    }
}