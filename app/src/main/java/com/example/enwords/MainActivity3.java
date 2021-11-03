package com.example.enwords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity3 extends AppCompatActivity {
    Utilities util = new Utilities();
    Timer tm = new Timer();
    Task tsk = new Task();
    Map<String, String> CategoryMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle arguments = getIntent().getExtras();
        Category cat = (Category) arguments.getSerializable(Category.class.getSimpleName());
        CategoryMap = cat.category;


        Map<String, String> Category_test = util.CreatingTest(CategoryMap,findViewById(R.id.textView2));

        util.FillingPoints(findViewById(R.id.textView), Utilities.points, Utilities.AllPoints);

        //1
        util.FillingButtons(findViewById(R.id.choose_butt_1), Category_test);
        //2
        util.FillingButtons(findViewById(R.id.choose_butt_2), Category_test);
        //3
        util.FillingButtons(findViewById(R.id.choose_butt_3), Category_test);
        //4
        util.FillingButtons(findViewById(R.id.choose_butt_4), Category_test);
    }

    public void onButtonClickBack(View view) {
        Intent intent2 = new Intent(this, MainActivity2.class);
        startActivity(intent2);
        Utilities.points = 0;
        Utilities.AllPoints = 0;
    }


    public void onButtonClickButton1(View view){
        if (util.Checking(findViewById(R.id.choose_butt_1), findViewById(R.id.textView), Utilities.right_key, Utilities.points,Utilities.AllPoints))
            Utilities.points++;
        Utilities.AllPoints++;
        tm.schedule(tsk, 2000);
    }

    public void onButtonClickButton2(View view) {
        if (util.Checking(findViewById(R.id.choose_butt_2), findViewById(R.id.textView), Utilities.right_key, Utilities.points,Utilities.AllPoints))
            Utilities.points++;
        Utilities.AllPoints++;
        tm.schedule(tsk, 2000);
    }

    public void onButtonClickButton3(View view) {
        if (util.Checking(findViewById(R.id.choose_butt_3), findViewById(R.id.textView), Utilities.right_key, Utilities.points,Utilities.AllPoints))
            Utilities.points++;
        Utilities.AllPoints++;
        tm.schedule(tsk, 2000);
    }

    public void onButtonClickButton4(View view) {
        if (util.Checking(findViewById(R.id.choose_butt_4), findViewById(R.id.textView), Utilities.right_key, Utilities.points,Utilities.AllPoints))
            Utilities.points++;
        Utilities.AllPoints++;
        tm.schedule(tsk, 2000);
    }


    private class Task extends TimerTask
    {
        public void run() {
            overridePendingTransition(0, 0);
            startActivity(getIntent());
            overridePendingTransition(0, 0);
        }
    }
}