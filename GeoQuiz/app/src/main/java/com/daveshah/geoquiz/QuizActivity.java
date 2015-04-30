package com.daveshah.geoquiz;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class QuizActivity extends ActionBarActivity {

    private Button trueButton;
    private Button falseButton;
    private Button nextButton;
    private TextView questionTextView;
    private QuestionBank questionBank;
    private int questionNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        bindViews();

        questionBank = new QuestionBank(this);

        setCurrentQuestionText();


        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementQuestion();
                setCurrentQuestionText();
            }
        });
    }

    private void incrementQuestion() {
        questionNumber = (questionNumber+1) % questionBank.getQuestionCount();
    }

    private void setCurrentQuestionText() {
        TrueFalse currentQuestion = questionBank.questionNumber(questionNumber);
        questionTextView.setText(currentQuestion.getQuestion());
    }

    private void bindViews() {
        trueButton = (Button) findViewById(R.id.true_button);
        falseButton = (Button) findViewById(R.id.false_button);
        nextButton = (Button) findViewById(R.id.next_button);
        questionTextView = (TextView) findViewById(R.id.question_text_view);
    }
}
