package com.example.enwords;

import java.io.Serializable;
import java.util.Map;

/**
 * Класс для сериализации категории теста
 */
public class Category implements Serializable {
    transient Map<String, String> category_obj;
    public Category(Map<String, String> cat){ this.category_obj = cat; }
}
