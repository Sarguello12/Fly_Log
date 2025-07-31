package com.Fly_Log_backend.models;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

public class Fly {
    @Id @GeneratedValue
    private long id;
    private String name;
    private String description;
    private List<Material> materialList;
}
