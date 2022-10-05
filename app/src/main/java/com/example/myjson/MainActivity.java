package com.example.myjson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.myjson.json.Myinfo;
import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Myinfo myinfo = null;
        Myinfo myinfo2 = null;
        Gson gson = null;
        String json = null;
        String json2 = null;
        List<Myinfo> list =null;
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
        //Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_LONG);}
        json2 = "{\"calificacion\":9.5,\"edad\":17,\"nombre\":\"Gerdoc 1\",\"sexo\":true}";
        myinfo2 = gson.fromJson(json2, Myinfo.class);
        if(myinfo2 != null){
            mensaje = String.format( "(%s)(%d)(%f)(%s)" , myinfo2.getNombre() , myinfo2.getEdad() , myinfo2.getCalificacion(), myinfo2.getSexo() ? "F": "M");
        }
        else
        {
            mensaje = "Error2";
        }
        Log.d(TAG, mensaje);
    }
}