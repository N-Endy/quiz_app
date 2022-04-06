package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Locale;

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
        RadioButton radioButton = findViewById(R.id.questionOne_option_one_1899);
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
        CheckBox messi = findViewById(R.id.question2_optionOne_messi);
        CheckBox xavi = findViewById(R.id.question2_optionTwo_xavi);
        CheckBox neymar = findViewById(R.id.question2_optionThree_neymar);
        CheckBox suarez = findViewById(R.id.question2_optionFour_suarez);

        if (!messi.isChecked() && !neymar.isChecked() && !suarez.isChecked() && !xavi.isChecked()) {
            Toast.makeText(this,"Please select an option for question 2",Toast.LENGTH_SHORT).show();
        } else if (messi.isChecked() && suarez.isChecked() && neymar.isChecked() && !xavi.isChecked()) {
            totalCorrectAnswer += 1;
        }
    }

    /**
     * Question 3 Method
     */
    public  void questionThree() {
        EditText editText = findViewById(R.id.question3_edit_text_view);
        String answer = editText.getText().toString().toLowerCase(Locale.ROOT);
        if (answer.matches("")) {
            Toast.makeText(this,"Please write an answer for question 3",Toast.LENGTH_SHORT).show();
        } else if (answer.matches("camp nou")) {
            totalCorrectAnswer += 1;
        }
    }

    /**
     * Question 4 method
     */
    public void questionFour() {
        CheckBox arragones = findViewById(R.id.question4_option1_arragones);
        CheckBox pep = findViewById(R.id.question4_option2_pep);
        CheckBox enrique = findViewById(R.id.question4_option3_enrique);
        CheckBox jose = findViewById(R.id.question4_option4_jose);

        if (!arragones.isChecked() && !pep.isChecked() && !enrique.isChecked() && !jose.isChecked()) {
            Toast.makeText(this,"Please select an option for question 4",Toast.LENGTH_SHORT).show();
        } else if (arragones.isChecked() && jose.isChecked() && !pep.isChecked() && !enrique.isChecked()) {
            totalCorrectAnswer += 1;
        }
    }

    /**
     * Question Five Method
     */
    public void questionFive() {
        RadioGroup radioGroup = findViewById(R.id.questionFive_radioGroup);
        RadioButton radioButton = findViewById(R.id.question5_option4_guardiola);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this,"Please select an option for question 5",Toast.LENGTH_SHORT).show();
        } else if (radioButton.isChecked()) {
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
        questionThree();
        questionFour();
        questionFive();
        Log.i("Main Activity", "submitButton: " + totalCorrectAnswer);
        Toast.makeText(this,"You scored " + totalCorrectAnswer + " out of 5",Toast.LENGTH_SHORT).show();
        finish();
        overridePendingTransition(0, 0);
        startActivity(getIntent());
        overridePendingTransition(0, 0);
    }
}