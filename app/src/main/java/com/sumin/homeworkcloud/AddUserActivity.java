package com.sumin.homeworkcloud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class AddUserActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextLastName;
    private EditText editTextAge;
    private Spinner spinnerSex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        editTextAge = findViewById(R.id.editTextAge);
        editTextName = findViewById(R.id.editTextName);
        editTextLastName = findViewById(R.id.editTextLastName);
        spinnerSex = findViewById(R.id.spinnerSex);
    }

    public void onClickSaveUser(View view) {
        String name = editTextName.getText().toString().trim();
        String lastName = editTextLastName.getText().toString().trim();
        int age = 0;
        try {
            age = Integer.parseInt(editTextAge.getText().toString().trim());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        String sex = spinnerSex.getSelectedItem().toString().trim();
        saveUser(name, lastName, age, sex);
    }

    private void saveUser(String name, String lastName, int age, String sex) {
        if (!name.isEmpty() && !lastName.isEmpty() && !sex.isEmpty() && age > 0) {
            Log.i("SexTest", sex);
        }
    }
}
