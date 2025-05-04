package uz.app.coursemanagementsystem.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import uz.app.coursemanagementsystem.Adapter.CoursesAdapter;
import uz.app.coursemanagementsystem.Adapter.CoursesDomain;
import uz.app.coursemanagementsystem.R;

public class CoursesListActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterCourceList;
    private RecyclerView recyclerViewCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_list);
        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<CoursesDomain> items = new ArrayList<>();
        items.add(new CoursesDomain("Advanced certification Program in AI", 169, "ic_1"));
        items.add(new CoursesDomain("Google Cloud Platform Architecture", 69, "ic_2"));
        items.add(new CoursesDomain("Advanced certification Program in AI", 169, "ic_1"));
        items.add(new CoursesDomain("Google Cloud Platform Architecture", 69, "ic_2"));
        items.add(new CoursesDomain("PG Program in Big Data Engineering", 49, "ic_5"));
        items.add(new CoursesDomain("Google Cloud Platform Architecture", 69, "ic_2"));
        items.add(new CoursesDomain("Introduction to UI design history", 79, "ic_4"));
        items.add(new CoursesDomain("Google Cloud Platform Architecture", 69, "ic_2"));
        items.add(new CoursesDomain("Fundamental of java Programming", 150, "ic_3"));
        items.add(new CoursesDomain("Advanced certification Program in AI", 169, "ic_1"));
        items.add(new CoursesDomain("Fundamental of java Programming", 150, "ic_3"));
        items.add(new CoursesDomain("Google Cloud Platform Architecture", 69, "ic_2"));
        items.add(new CoursesDomain("Fundamental of java Programming", 150, "ic_3"));
        items.add(new CoursesDomain("PG Program in Big Data Engineering", 49, "ic_5"));
        items.add(new CoursesDomain("Introduction to UI design history", 79, "ic_4"));
        items.add(new CoursesDomain("Fundamental of java Programming", 150, "ic_3"));
        items.add(new CoursesDomain("Introduction to UI design history", 79, "ic_4"));
        items.add(new CoursesDomain("Advanced certification Program in AI", 169, "ic_1"));
        items.add(new CoursesDomain("Introduction to UI design history", 79, "ic_4"));
        items.add(new CoursesDomain("PG Program in Big Data Engineering", 49, "ic_5"));
        items.add(new CoursesDomain("Introduction to UI design history", 79, "ic_4"));
        items.add(new CoursesDomain("PG Program in Big Data Engineering", 49, "ic_5"));
        items.add(new CoursesDomain("Fundamental of java Programming", 150, "ic_3"));
        items.add(new CoursesDomain("PG Program in Big Data Engineering", 49, "ic_5"));
        items.add(new CoursesDomain("Advanced certification Program in AI", 169, "ic_1"));

        recyclerViewCourse = findViewById(R.id.view);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapterCourceList = new CoursesAdapter(items);
        recyclerViewCourse.setAdapter(adapterCourceList);
    }
}