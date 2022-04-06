package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int totalCorrectAnswer = 0;

    /**
     * Question 1 Method
     */
    public void questionOne() {
        RadioGroup radioGroup = findViewById(R.id.questionOne_radioGroup);
        RadioButton radioButton = findViewById(R.id.eighteen_ninety_nine);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this,"Please select an option for question 1",Toast.LENGTH_SHORT).show();
        } else if (radioButton.isChecked()) {
            totalCorrectAnswer += 1;
        }
    }

    /**
     * Question 2 Method
     */
    public void questionTwo() {
        CheckBox messi = findViewById(R.id.messi);
        CheckBox neymar = findViewById(R.id.neymar);
        CheckBox suarez = findViewById(R.id.suarez);
        CheckBox xavi = findViewById(R.id.xavi);

        if (!messi.isChecked() && !neymar.isChecked() && !suarez.isChecked() && !xavi.isChecked()) {
            Toast.makeText(this,"Please select an option for question 2",Toast.LENGTH_SHORT).show();
        } else if (messi.isChecked() && suarez.isChecked() && neymar.isChecked()) {
            totalCorrectAnswer += 1;
        }
    }


    /**
     * Submit Button Method
     * @param view tag
     */
    public void submitButton(View view) {
        questionOne();
        questionTwo();
        Log.i("Main Activity", "submitButton: " + totalCorrectAnswer);
        Toast.makeText(this,"You scored " + totalCorrectAnswer + " out of 5",Toast.LENGTH_SHORT).show();
    }
}