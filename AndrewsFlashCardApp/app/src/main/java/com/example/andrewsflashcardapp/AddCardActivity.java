package com.example.andrewsflashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class AddCardActivity extends AppCompatActivity {

    EditText editTextQuestion;
    EditText editTextAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        ImageView cancelButton = findViewById(R.id.cancelButton);
        ImageView saveButton = findViewById(R.id.saveButton);
        editTextQuestion = findViewById(R.id.editTextQuestion);
        editTextAnswer = findViewById(R.id.editTextAnswer);


         cancelButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 finish();
             }
         });
         saveButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent data = new Intent(); //create new intent where we put data
                 String inputQuestion=((EditText) editTextQuestion).getText().toString();
                 String inputAnswer=((EditText) editTextAnswer).getText().toString();

                 data.putExtra("question",inputQuestion);
                 data.putExtra("answer",inputAnswer);

                 setResult(RESULT_OK,data);
                 finish();


             }
         });

    }
}