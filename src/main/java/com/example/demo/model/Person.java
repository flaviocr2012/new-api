package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Person {

    private final UUID id;

    @NotBlank
    private String name;

    // @JsonProperty - especifica a chave exata do documento json. Se o nome da variável e no json
    // não correspondem usamos essa anotação.
    public Person(@JsonProperty UUID id,
                  @JsonProperty String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
