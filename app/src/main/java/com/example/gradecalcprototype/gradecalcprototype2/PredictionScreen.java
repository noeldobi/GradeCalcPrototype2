package com.example.gradecalcprototype.gradecalcprototype2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class PredictionScreen extends AppCompatActivity {

    TextView tvModule1, tvModule2, tvModule3, tvModule4, tvModule5;
    TextView name1, name2, name3, name4, name5;
    TextView degreescore, degreepercent;
    int num1, num2, num3, num4, num5;
    double score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediction_screen);

        /*This is how we receive our values for relevant variables from the second screen*/

        Bundle bundle1 = getIntent().getExtras();

        degreescore = (TextView) findViewById(R.id.textView18);
        degreepercent = (TextView) findViewById(R.id.textView19);

        /*This is how we unpackage the bundle to be able to use the variables in this activity*/

        num1 = bundle1.getInt ("result1");
        num2 = bundle1.getInt ("result2");
        num3 = bundle1.getInt ("result3");
        num4 = bundle1.getInt ("result4");
        num5 = bundle1.getInt ("result5");

        score = (num1 + num2 + num3 + num4 + num5) / 5.0;

        /*Conditional function that decides the classification of the degree*/

        if(score >= 70) {

            degreescore.setText("1st");
            degreepercent.setText(score + "%");

        }

        else if (score < 70 && score > 60) {

            degreescore.setText("2.1");
            degreepercent.setText(score + "%");

        }

        else if (score < 60 && score > 50) {

            degreescore.setText("2.2");
            degreepercent.setText(score + "%");

        }

        else if (score < 50 && score > 40) {

            degreescore.setText("3rd");
            degreepercent.setText(score + "%");

        }

        else {

            degreescore.setText("Fail");
            degreepercent.setText(score + "%");

        }

        /*Code that allocates numerical values to textfields related to module scores*/

        tvModule1 = (TextView) findViewById(R.id.textView10);
        tvModule2 = (TextView) findViewById(R.id.textView11);
        tvModule3 = (TextView) findViewById(R.id.textView12);
        tvModule4 = (TextView) findViewById(R.id.textView13);
        tvModule5 = (TextView) findViewById(R.id.textView14);

        /*Code that allocates numerical values related to module names*/

        name1 = (TextView) findViewById(R.id.textView8);
        name2 = (TextView) findViewById(R.id.textView9);
        name3 = (TextView) findViewById(R.id.textView15);
        name4 = (TextView) findViewById(R.id.textView16);
        name5 = (TextView) findViewById(R.id.textView17);



        /*We create arrays to be able to sort our stored scores for modules*/

        Integer[] results = new Integer[5];

        results[0] = num1;
        results[1] = num2;
        results[2] = num3;
        results[3] = num4;
        results[4] = num5;


        Arrays.sort(results, Collections.reverseOrder());


        String[] name = new String[5];

        name[0] = "Module 1";
        name[1] = "Module 2";
        name[2] = "Module 3";
        name[3] = "Module 4";
        name[4] = "Module 5";

        /*The function below does the actual sorting*/


        for (int i = 0; i < results.length; i++) {
            if (results[i] == num1) {
                tvModule1.setText("" + results[0]);
                name1.setText("" + name[i]);

            }
            else if (results[i] == num2) {
                tvModule2.setText("" + results[1]);
                name2.setText("" + name[i]);
            }
            else if (results[i] == num3) {
                tvModule3.setText("" + results[2]);
                name3.setText("" + name[i]);
            }
            else if (results[i] == num4) {
                tvModule4.setText("" + results[3]);
                name4.setText("" + name[i]);
            }
            else if (results[i] == num5) {
                tvModule5.setText("" + results[4]);
                name5.setText("" + name[i]);

            }

        }

    }

}
