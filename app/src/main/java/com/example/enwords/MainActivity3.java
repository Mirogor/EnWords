package com.example.enwords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity3 extends AppCompatActivity {
    Utilities util = new Utilities();
    Timer tm = new Timer();
    Task tsk = new Task();
    Map<String, String> CategoryMap = new HashMap<>();
    List<Button> buttons = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btn1 = findViewById(R.id.choose_butt_1);
        Button btn2 = findViewById(R.id.choose_butt_2);
        Button btn3 = findViewById(R.id.choose_butt_3);
        Button btn4 = findViewById(R.id.choose_butt_4);

        buttons.add(0,btn1);
        buttons.add(1,btn2);
        buttons.add(2,btn3);
        buttons.add(3,btn4);

        Bundle arguments = getIntent().getExtras();
        Category cat = (Category) arguments.getSerializable(Category.class.getSimpleName());
        CategoryMap = cat.category_obj;


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
        util.ButtonEnability(buttons);
        tm.schedule(tsk, 1500);
    }

    public void onButtonClickButton2(View view) {
        if (util.Checking(findViewById(R.id.choose_butt_2), findViewById(R.id.textView), Utilities.right_key, Utilities.points,Utilities.AllPoints))
            Utilities.points++;
        Utilities.AllPoints++;
        util.ButtonEnability(buttons);
        tm.schedule(tsk, 1500);
    }

    public void onButtonClickButton3(View view) {
        if (util.Checking(findViewById(R.id.choose_butt_3), findViewById(R.id.textView), Utilities.right_key, Utilities.points,Utilities.AllPoints))
            Utilities.points++;
        Utilities.AllPoints++;
        util.ButtonEnability(buttons);
        tm.schedule(tsk, 1500);
    }

    public void onButtonClickButton4(View view) {
        if (util.Checking(findViewById(R.id.choose_butt_4), findViewById(R.id.textView), Utilities.right_key, Utilities.points,Utilities.AllPoints))
            Utilities.points++;
        Utilities.AllPoints++;
        util.ButtonEnability(buttons);
        tm.schedule(tsk, 1500);
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