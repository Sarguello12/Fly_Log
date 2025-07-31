package com.Fly_Log_backend.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

public class Material {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private List<String> colors;
}
