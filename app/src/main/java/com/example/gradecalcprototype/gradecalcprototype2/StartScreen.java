package com.example.gradecalcprototype.gradecalcprototype2;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartScreen extends AppCompatActivity {

    private static Button letsGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        OnClickButtonListener();

    }

    /*code attached to the button under picture (economics),
        if clicked brings user to the second screen*/

    public void OnClickButtonListener() {
        letsGo = (Button) findViewById(R.id.letsGo);
        letsGo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(StartScreen.this, InputResults.class);
                        startActivity(intent);
                    }
                }
        );
    }

}