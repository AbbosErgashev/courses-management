package uz.app.coursemanagementsystem.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import uz.app.coursemanagementsystem.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout btn1 = findViewById(R.id.btn1);
        ConstraintLayout btn2 = findViewById(R.id.btn2);
        ConstraintLayout btn3 = findViewById(R.id.btn3);
        ConstraintLayout btn4 = findViewById(R.id.btn4);
        btn1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));
        btn2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));
        btn3.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));
        btn4.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));
    }
}