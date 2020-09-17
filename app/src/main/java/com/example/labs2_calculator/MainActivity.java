package com.example.labs2_calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultat;
    private TextView operation;
    private int firstNumeric;
    private int lastNumeric;
    private char operator;
    private boolean calculReady = false;
    private boolean operatorReady = false;
    private boolean lastnumericReady = false;
    private int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        operation = (TextView) findViewById(R.id.tvOperation);
        resultat = (TextView) findViewById(R.id.tvResultat);

        Button buttonEqual = new Button(this);
        buttonEqual.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT, (float) 0.25));
        buttonEqual.setText("=");
        buttonEqual.setId(R.id.btnEqual);
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myClickHandler(v);
            }
        });

        LinearLayout l = findViewById(R.id.equalLayout);
        l.addView(buttonEqual);


        /*
        <Button
                android:id="@+id/btnEqual"
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:layout_weight="0.25"
                android:onClick="myClickHandler"
                android:text="=" />

                buttonEqual.setId(123456789);
        buttonEqual.setText("=");
        buttonEqual.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myClickHandler(v);
            }

        });
*/






        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void myClickHandler(View view) {
        switch (view.getId()) {
            case R.id.btnZero:
                if ((operation.getText().length() == 0) && (!calculReady)) {
                    operation.setText("0");
                    operatorReady=true;
                    firstNumeric=0;
                    return;
                }
                if((!calculReady) && (lastnumericReady)) {
                    operation.append("0");
                    lastNumeric=0;
                    calculReady=true;
                }
                break;
            case R.id.btnOne:
                if ((operation.getText().length() == 0) && (!calculReady)) {
                    operation.setText("1");
                    operatorReady=true;
                    firstNumeric=1;
                    return;
                }
                if((!calculReady) && (lastnumericReady)) {
                    operation.append("1");
                    lastNumeric=1;
                    calculReady=true;
                }
                break;
            case R.id.btnTwo:
                if ((operation.getText().length() == 0) && (!calculReady)) {
                    operation.setText("2");
                    operatorReady=true;
                    firstNumeric=2;
                    return;
                }
                if((!calculReady) && (lastnumericReady)) {
                    operation.append("2");
                    lastNumeric=2;
                    calculReady=true;
                }
                break;
            case R.id.btnThree:
                if ((operation.getText().length() == 0) && (!calculReady)) {
                    operation.setText("3");
                    operatorReady=true;
                    firstNumeric=3;
                    return;
                }
                if((!calculReady) && (lastnumericReady)) {
                    operation.append("3");
                    lastNumeric=3;
                    calculReady=true;
                }
                break;
            case R.id.btnFour:
                if ((operation.getText().length() == 0) && (!calculReady)) {
                    operation.setText("4");
                    operatorReady=true;
                    firstNumeric=4;
                    return;
                }
                if((!calculReady) && (lastnumericReady)) {
                    operation.append("4");
                    lastNumeric=4;
                    calculReady=true;
                }
                break;
            case R.id.btnFive:
                if ((operation.getText().length() == 0) && (!calculReady)) {
                    operation.setText("5");
                    operatorReady=true;
                    firstNumeric=5;
                    return;
                }
                if((!calculReady) && (lastnumericReady)) {
                    operation.append("5");
                    lastNumeric=5;
                    calculReady=true;
                }
                break;
            case R.id.btnSix:
                if ((operation.getText().length() == 0) && (!calculReady)) {
                    operation.setText("6");
                    operatorReady=true;
                    firstNumeric=6;
                    return;
                }
                if((!calculReady) && (lastnumericReady)) {
                    operation.append("6");
                    lastNumeric=6;
                    calculReady=true;
                }
                break;
            case R.id.btnSeven:
                if ((operation.getText().length() == 0) && (!calculReady)) {
                    operation.setText("7");
                    operatorReady=true;
                    firstNumeric=7;
                    return;
                }
                if((!calculReady) && (lastnumericReady)) {
                    operation.append("7");
                    lastNumeric=7;
                    calculReady=true;
                }
                break;
            case R.id.btnEight:
                if ((operation.getText().length() == 0) && (!calculReady)) {
                    operation.setText("8");
                    operatorReady=true;
                    firstNumeric=8;
                    return;
                }
                if((!calculReady) && (lastnumericReady)) {
                    operation.append("8");
                    lastNumeric=8;
                    calculReady=true;
                }
                break;
            case R.id.btnNine:
                if ((operation.getText().length() == 0) && (!calculReady)) {
                    operation.setText("9");
                    operatorReady=true;
                    firstNumeric=9;
                    return;
                }
                if((!calculReady) && (lastnumericReady)) {
                    operation.append("9");
                    lastNumeric=9;
                    calculReady=true;
                }
                break;
            case R.id.btnAdd:
                if(operatorReady)
                {
                    operator='+';
                    operation.append("+");
                    operatorReady=false;
                    lastnumericReady=true;
                }
                break;
            case R.id.btnSubtract:
                if(operatorReady)
                {
                    operator='-';
                    operation.append("-");
                    operatorReady=false;
                    lastnumericReady=true;
                }
                break;
            case R.id.btnMultiply:
                if(operatorReady)
                {
                    operator='*';
                    operation.append("*");
                    operatorReady=false;
                    lastnumericReady=true;
                }
                break;
            case R.id.btnDivide:
                if(operatorReady)
                {
                    operator='/';
                    operation.append("/");
                    operatorReady=false;
                    lastnumericReady=true;
                }
                break;
            case R.id.btnEqual:
                if((calculReady) && (operator=='+')){
                    result = firstNumeric + lastNumeric;
                    resultat.setText(String.valueOf(result));
                    operation.setText("");
                    calculReady = false;
                    operatorReady = false;
                    lastnumericReady = false;
                }
                if((calculReady) && (operator=='-')){
                    result = firstNumeric - lastNumeric;
                    resultat.setText(String.valueOf(result));
                    operation.setText("");
                    calculReady = false;
                    operatorReady = false;
                    lastnumericReady = false;
                }
                if((calculReady) && (operator=='*')){
                    result = firstNumeric * lastNumeric;
                    resultat.setText(String.valueOf(result));
                    operation.setText("");
                    calculReady = false;
                    operatorReady = false;
                    lastnumericReady = false;
                }
                if((calculReady) && (operator=='/')){
                    result = firstNumeric / lastNumeric;
                    resultat.setText(String.valueOf(result));
                    operation.setText("");
                    calculReady = false;
                    operatorReady = false;
                    lastnumericReady = false;
                }
        }
    }
}