package com.example.gradecalcprototype.gradecalcprototype2;

import android.content.Intent;
import android.gesture.Prediction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputResults extends AppCompatActivity {

    Button predict;
    EditText input1, input2, input3, input4, input5;
    Bundle bundle1 = new Bundle();

    /*Code that sets up the layout of the second screen and waits for user to input
     * module scores + to press button on the bottom */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_results);
        OnClickButtonListener2();

    }

    /*Code designed for the button to send values to third screen*/

    public void OnClickButtonListener2() {
        predict = (Button) findViewById(R.id.button2);
        predict.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        input1 = (EditText) findViewById(R.id.editText1);
                        input2 = (EditText) findViewById(R.id.editText2);
                        input3 = (EditText) findViewById(R.id.editText3);
                        input4 = (EditText) findViewById(R.id.editText4);
                        input5 = (EditText) findViewById(R.id.editText5);

                        /*Code that reads in values typed in by user*/

                        final int result1 = Integer.parseInt(input1.getText().toString());
                        final int result2 = Integer.parseInt(input2.getText().toString());
                        final int result3 = Integer.parseInt(input3.getText().toString());
                        final int result4 = Integer.parseInt(input4.getText().toString());
                        final int result5 = Integer.parseInt(input5.getText().toString());

                        /*Code that actually packages the values for stored variables and sends
                        * them to third screen*/

                        Intent intent1 = new Intent(InputResults.this, PredictionScreen.class);
                        bundle1.putInt("result1", result1);
                        bundle1.putInt("result2", result2);
                        bundle1.putInt("result3", result3);
                        bundle1.putInt("result4", result4);
                        bundle1.putInt("result5", result5);

                        intent1.putExtras(bundle1);
                        startActivity(intent1);
                    }
                }
        );
    }
}
