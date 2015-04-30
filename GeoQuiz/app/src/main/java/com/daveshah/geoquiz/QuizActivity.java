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
    private TrueFalseQuestionsStore trueFalseQuestionsStore;
    private int questionIndex;
    private TrueFalseQuestion currentQuestion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        bindViews();
        trueFalseQuestionsStore = new TrueFalseQuestionsStore(this);

        currentQuestion = trueFalseQuestionsStore.getQuestionNumber(questionIndex);
        questionTextView.setText(currentQuestion.getQuestion());
        trueButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                checkAnswer(currentQuestion,true);
            }
        });

        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(currentQuestion,false);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionIndex++;
                currentQuestion = trueFalseQuestionsStore.getQuestionNumber(questionIndex);
                questionTextView.setText(currentQuestion.getQuestion());
            }
        });
    }

    private void checkAnswer(TrueFalseQuestion trueFalseQuestion, boolean selectedValue) {

        int messageId;
        if(trueFalseQuestion.isAnswer() == selectedValue) {
            messageId = R.string.correct_toast_message;
        }else {
            messageId = R.string.incorrect_toast_message;
        }
        Toast.makeText(this,messageId,Toast.LENGTH_LONG).show();
    }

    private void bindViews() {
        trueButton = (Button) findViewById(R.id.true_button);
        falseButton = (Button) findViewById(R.id.false_button);
        nextButton = (Button) findViewById(R.id.next_button);
        questionTextView = (TextView) findViewById(R.id.question_text_view);
    }

}
