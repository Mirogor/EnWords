package com.example.enwords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/** Класс для создания стартовой страницы */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.comb);
        TextView tv = findViewById(R.id.text_logo);
        tv.startAnimation(anim);
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
    /** Фунция отлавливание события нажания кнопки Start
     * @param view Внешнее представление кнопки */
    public void onButtonClickStart(View view) {
        Intent intent2 = new Intent(this, MainActivity2.class);
        startActivity(intent2);
    }
}