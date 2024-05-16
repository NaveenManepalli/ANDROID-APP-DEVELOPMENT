package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

public class Experiment5 extends AppCompatActivity {
    private EditText editTextTask;
    private Button buttonAddTask;
    private ListView listViewTasks;
    private ArrayAdapter<Task> taskAdapter;
    private ArrayList<Task> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment5);
        editTextTask = findViewById(R.id.editTextTask);
        buttonAddTask = findViewById(R.id.buttonAddTask);

        listViewTasks = findViewById(R.id.listViewTasks);
        taskList = new ArrayList<>();
        taskAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                taskList);
        listViewTasks.setAdapter(taskAdapter);
    }

    public void addTask(View view) {
        String taskDescription = editTextTask.getText().toString().trim();
        if (!taskDescription.isEmpty()) {
            Task newTask = new Task(taskDescription);
            taskList.add(newTask);
            taskAdapter.notifyDataSetChanged();
            editTextTask.getText().clear();
        }
    }
}

class Task {
    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
