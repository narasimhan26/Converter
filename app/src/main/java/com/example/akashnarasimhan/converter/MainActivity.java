package com.example.akashnarasimhan.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6;
    Spinner s1,s2,s3,s4,s5,s6;
    double val1=0,val2=0,converted=0;
    Converter converter = new Converter();
    TempConverter tempConverter = new TempConverter();
    DistConverter distConverter = new DistConverter();
    ArrayAdapter<CharSequence> wght,temp,dis;
    String str2, str1, str3, str4, str5, str6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.edittext1);
        e2 = findViewById(R.id.edittext2);
        e3 = findViewById(R.id.edittext3);
        e4 = findViewById(R.id.edittext4);
        e5 = findViewById(R.id.edittext5);
        e6 = findViewById(R.id.edittext6);
        s1 = findViewById(R.id.spinner1);
        s2 = findViewById(R.id.spinner2);
        s3 = findViewById(R.id.spinner3);
        s4 = findViewById(R.id.spinner4);
        s5 = findViewById(R.id.spinner5);
        s6 = findViewById(R.id.spinner6);
        wght = ArrayAdapter.createFromResource(this,R.array.weight,android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(wght);
        s2.setAdapter(wght);
        dis = ArrayAdapter.createFromResource(this,R.array.length,android.R.layout.simple_spinner_dropdown_item);
        s5.setAdapter(dis);
        s6.setAdapter(dis);
        temp = ArrayAdapter.createFromResource(this,R.array.temperature,android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(temp);
        s4.setAdapter(temp);
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s = e1.getText().toString();
                e1.setText(s);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
        s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s = e3.getText().toString();
                e3.setText(s);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
        s6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s = e5.getText().toString();
                e5.setText(s);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s = e1.getText().toString();
                e1.setText(s);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s = e3.getText().toString();
                e3.setText(s);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
        s5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s = e5.getText().toString();
                e5.setText(s);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        e1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!e1.getText().toString().equals("")){
                    str1 = s1.getSelectedItem().toString().toLowerCase();
                    str2 = s2.getSelectedItem().toString().toLowerCase();
                    val1 = Double.parseDouble(e1.getText().toString());
                    //val2 = Double.parseDouble(e2.getText().toString());
                    converted = converter.Convert(str1,val1);
                    val2 = converter.Display(str2,converted);
                    String result = (Math.round(val2*100)/(double)100)+"";
                    e2.setText(result);
                }}
            @Override
            public void afterTextChanged(Editable editable) {}
        });
        e3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!e3.getText().toString().equals("")){
                    str3 = s3.getSelectedItem().toString().toLowerCase();
                    str4 = s4.getSelectedItem().toString().toLowerCase();
                    val1 = Double.parseDouble(e3.getText().toString());
                    converted = tempConverter.Convert(str3,val1);
                    val2 = tempConverter.Display(str4,converted);
                    String result = (Math.round(val2*100)/(double)100)+"";
                    e4.setText(result);
                }}
            @Override
            public void afterTextChanged(Editable editable) {}
        });
        e5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!e5.getText().toString().equals("")){
                    str5 = s5.getSelectedItem().toString().toLowerCase();
                    str6 = s6.getSelectedItem().toString().toLowerCase();
                    val1 = Double.parseDouble(e5.getText().toString());
                    converted = distConverter.Convert(str5, val1);
                    val2 = distConverter.Display(str6,converted);
                    String result = (Math.round(val2*100)/(double)100)+"";
                    e6.setText(result);
                }
            }
            @Override
            public void afterTextChanged(Editable editable) {}
        });
    }
}
