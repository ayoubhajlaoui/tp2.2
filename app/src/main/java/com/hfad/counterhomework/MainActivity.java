package com.hfad.counterhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int c=0;
    private TextView counter;
    private TextView inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter =(TextView) findViewById(R.id.textView);
        inputText=(TextView) findViewById(R.id.editTextTextPersonName);
        //Restore the state.
        if (savedInstanceState != null){
                counter.setText(savedInstanceState.getString("count_text"));

            }

        }

    }
    public void clickCounter (View view){
        c++;
        if(counter!=null) {
            counter.setText(Integer.toString(counter));

        }

    }

    protected void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        if (counter.getText() !="0"){
            savedInstanceState.putString("count_text",counter.getText().toString());

        }
    }

}