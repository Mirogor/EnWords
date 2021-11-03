package com.example.enwords;

import java.io.Serializable;
import java.util.Map;

/**
 * Класс для сериализации категории теста
 */
public class Category implements Serializable {
    public Map<String, String> category;
    public Category(Map<String, String> category){ this.category = category; }
}
