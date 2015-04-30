package com.daveshah.geoquiz;

public class TrueFalseQuestion {

      private final String question;
      private final boolean answer;

      public TrueFalseQuestion(String question, boolean answer) {
            this.question = question;
            this.answer = answer;
      }

      public String getQuestion() {
            return question;
      }

      public boolean isAnswer() {
            return answer;
      }
}
