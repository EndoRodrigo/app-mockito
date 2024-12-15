package org.endorodrigo.model;

import java.util.ArrayList;
import java.util.List;

public class Examen {
    private Long id;
    private String name;
    private List<String> preguntas;

    public Examen(Long id, String name) {
        this.id = id;
        this.name = name;
        this.preguntas = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
