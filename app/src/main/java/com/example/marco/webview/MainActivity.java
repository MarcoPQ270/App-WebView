package com.example.marco.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText)findViewById(R.id.edt1);

    }
    public void enlace(View v){
        String enlace = edt1.getText().toString();
        if (enlace.isEmpty()) {
            Toast.makeText(this, "El campoesta vacio", Toast.LENGTH_LONG).show();
        }else{
            Intent i = new Intent(this, sitioweb.class);
            i.putExtra("enlace", edt1.getText().toString());
            startActivity(i);
            }

        }
//llave Final
}

