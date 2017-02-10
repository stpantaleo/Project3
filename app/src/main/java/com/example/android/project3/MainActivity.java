package com.example.android.project3;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.name;
import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {
        CheckBox mindStone = (CheckBox) findViewById(R.id.mind_stone_checkbox);
        boolean yesMindStone = mindStone.isChecked();

        String answerMessage = createAnswerSummary(yesMindStone);


    }

    private String createAnswerSummary(boolean yesMindStone) {
        if (yesMindStone = true) ;
            return("true");

    }
private String createSubmitAnswer (String name, boolean yesMindStone){
     String answerMessage = "\nName: " + name;
     answerMessage += "\n Add Minid Stone? " + yesMindStone;
    return answerMessage;

}
}
