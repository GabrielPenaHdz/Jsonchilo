package com.example.myjson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.myjson.json.Myinfo;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Myinfo myinfo = null;
        Gson gson = null;
        String json = null;
        String mensaje = null;

        myinfo = new Myinfo();
        myinfo.setCalificacion(4.5f);
        myinfo.setEdad(17);
        myinfo.setNombre("Gabriel");
        myinfo.setSexo(Boolean.FALSE);
        Log.d(TAG, "TEST");
        gson = new Gson();
        json = gson.toJson(myinfo);
        if(json != null) {
            Log.d(TAG, json);
            mensaje = "Ok";
        }
        else{
            mensaje = "Error";
        }
        Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_LONG);
    }
}