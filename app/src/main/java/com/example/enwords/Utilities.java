package com.example.enwords;
import android.graphics.Color;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Random;

/**
 * Класс утилит
 */

public class Utilities {
    /** Поле набранных очков */
    public static int points;

    /** Поле максимально возможных очков */
    public static int AllPoints;

    /** Поле правильного ответа */
    static String right_key;

    /** Фукнция получения случайного ключа в словаре
     * @param category словарь категории
     * @return Случайный ключ к элементу словаря*/
    public static String rand(Map<String,String> category){
        Random random    = new Random(System.currentTimeMillis()*256);
        List<String> keys  = new ArrayList<>(category.keySet());
        return keys.get(random.nextInt(category.size()));
    }
    /** Функция удаления элемента словаря
     * @param category словарь категории
     * @param key ключ элемента, который требуется удалить */
    public void cutting_list(Map<String,String> category, String key){
        category.remove(key);
    }

    /** Функция заполнения кнопки вариантом ответа
     * @param bt Кнопка для заполнения
     * @param Category Словарь категории, из которого получаем вариант ответа*/
    public void FillingButtons(Button bt, Map<String,String> Category){
        String rnd_key = rand(Category);
        bt.setText(rnd_key);
        this.cutting_list(Category, rnd_key);
    }

    /** Фунция проверки правильности ответа
     * @param bt Кнопка, выбранного ответа
     * @param AllPoints Всего возможных очков
     * @param points Всего полученных очков
     * @param right_key правильный ответ
     * @param textView Текстовое поле со словом для перевода
     * @return Правильный ли ответ */
    public Boolean Checking(Button bt,TextView textView, String right_key, int points, int AllPoints){
        int redColorValue = Color.RED;
        int greenColorValue = Color.GREEN;
        AllPoints++;
        String p;
        if (bt.getText().toString().equals(right_key)) {
            bt.setBackgroundColor(greenColorValue);
            points++;
            p = "Points:" + points + " of " + AllPoints;
            textView.setText(p);
            return true;
        }
        else {
            bt.setBackgroundColor(redColorValue);
            p = "Points:" + points + " of " + AllPoints;
            textView.setText(p);
            return false;
        }
    }

    /** Функция заполнения текстового поля очками
     * @param textView Текствое поле для заполнения
     * @param points Всего полученных очков
     * @param AllPoints Всего возможных очков*/
    public void FillingPoints(TextView textView, int points, int AllPoints){
        String p = "Points:" + points + " of " + AllPoints;
        textView.setText(p);
    }
    /** Функция создания случайного теста по категории
     * @param textView Текствое поле со словом для перевода
     * @param Category Категория для создания теста
     * @return Словарь с тестом */
    public Map<String,String> CreatingTest(Map<String,String> Category, TextView textView){
        right_key = Utilities.rand(Category);
        String right_value = Category.get(right_key);
        textView.setText(right_value);

        Map<String, String> Category_test = new HashMap<>();
        Category_test.put(right_key, right_value);

        while (Category_test.size() < 4) {
            String local_rd_key = Utilities.rand(Category);
            String local_rd_val = Category.get(local_rd_key);
            Category_test.put(local_rd_key, local_rd_val);
        }
        return Category_test;
    }

}
