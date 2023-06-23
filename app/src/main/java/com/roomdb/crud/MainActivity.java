package com.roomdb.crud;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //declarations of all public variables
    EditText ourScreen;
    boolean isNewOparator = true;
    String oldNumber = "";
    String oprator = "+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ourScreen = findViewById(R.id.screen);


    }

    public void nuberShow(View view) {

        if (isNewOparator)
            ourScreen.setText("");
        isNewOparator = false;

        String numbers = ourScreen.getText().toString();

        switch (view.getId()) {

            case R.id.btn_seven:
                numbers += "7";
                break;
            case R.id.btn_eight:
                numbers += "8";
                break;
            case R.id.btn_nine:
                numbers += "9";
                break;
            case R.id.btn_zero:
                numbers += "0";
                break;
            case R.id.btn_one:
                numbers += "1";
                break;
            case R.id.btn_two:
                numbers += "2";
                break;
            case R.id.btn_three:
                numbers += "3";
                break;
            case R.id.btn_four:
                numbers += "4";
                break;
            case R.id.btn_five:
                numbers += "5";
                break;
            case R.id.btn_six:
                numbers += "6";
                break;
            case R.id.btn_dot:
                numbers += ".";
                break;
            case R.id.plusMinus:
                numbers = "-" + numbers;
        }
        ourScreen.setText(numbers);
    }

    public void oparatorFuntional(View view) {

        isNewOparator = true;
        oldNumber = ourScreen.getText().toString();

        switch (view.getId()) {
            case R.id.devide:
                oprator = "/";
                break;
            case R.id.multipliedby:
                oprator = "*";
                break;
            case R.id.btn_plus:
                oprator = "+";
                break;
            case R.id.btn_minus:
                oprator = "-";
                break;

        }


    }

    public void equalEvent(View view) {

        String newNumber = ourScreen.getText().toString();

        Double result = 0.0;

        switch (oprator) {
            case "/":
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                break;

            case "*":
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;

            case "-":
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                break;
            case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                break;
        }
        ourScreen.setText(result + "");

    }

    public void modulasOparator(View view) {

        double oparation = Double.parseDouble(ourScreen.getText().toString()) / 100;
        ourScreen.setText(oparation + "");
        isNewOparator = true;


    }

    public void allClear(View view) {
        ourScreen.setText("0");
        isNewOparator = true;
    }
}