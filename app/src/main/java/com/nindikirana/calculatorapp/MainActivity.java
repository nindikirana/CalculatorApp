package com.nindikirana.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edNumber1;
    EditText edNumber2;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNumber1 = findViewById(R.id.number1);
        edNumber2 = findViewById(R.id.number2);
        tvResult = findViewById(R.id.result);

        edNumber1.setText("0");
        edNumber2.setText("0");

        Button btnAdd = findViewById(R.id.btnTambah);
        btnAdd.setOnClickListener(this);
        Button btnSub = findViewById(R.id.btnKurang);
        btnSub.setOnClickListener(this);
        Button btnMul = findViewById(R.id.btnKali);
        btnMul.setOnClickListener(this);
        Button btnDiv = findViewById(R.id.btnBagi);
        btnDiv.setOnClickListener(this);
        Button btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Double val1 = Double.parseDouble(edNumber1.getText().toString());
        Double val2 = Double.parseDouble(edNumber2.getText().toString());

        if(v.getId() == R.id.btnTambah){
            Double res = val1 + val2;
            tvResult.setText(res+"");
        }else if(v.getId() == R.id.btnKurang){
            Double res = val1 - val2;
            tvResult.setText(res+"");
        }else if(v.getId() == R.id.btnKali) {
            Double res = val1 * val2;
            tvResult.setText(res+"");
        }else if(v.getId() == R.id.btnBagi) {
            Double res = val1 / val2;
            tvResult.setText(res+"");
        }else if(v.getId() == R.id.btnClear) {
            edNumber1.setText("0");
            edNumber2.setText("0");
            tvResult.setText("0");
        }
    }
}