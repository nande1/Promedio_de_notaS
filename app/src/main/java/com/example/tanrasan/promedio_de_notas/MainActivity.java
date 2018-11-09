package com.example.tanrasan.promedio_de_notas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.txt_matematicas);
        et2=(EditText)findViewById(R.id.txt_fisica);
        et3=(EditText)findViewById(R.id.txt_quimica);
        tv1=(TextView)findViewById(R.id.tv_estatus);

    }
    public void estatus(View view){
        String Matematicas_string=et1.getText().toString();
        String Fisica_string=et2.getText().toString();
        String Quimica_string=et3.getText().toString();

        int Matematicas_int=Integer.parseInt(Matematicas_string);
        int Fisica_int=Integer.parseInt(Fisica_string);
        int Qunimica_int=Integer.parseInt(Quimica_string);
        int promedio=(Matematicas_int+Fisica_int+Qunimica_int)/3;
        if (promedio>=6){
            tv1.setText("Estatus Aprobado con "+promedio);
        }else if(promedio <=5){
            tv1.setText("Estatus Desaprobado con "+promedio);

        }

    }

}
