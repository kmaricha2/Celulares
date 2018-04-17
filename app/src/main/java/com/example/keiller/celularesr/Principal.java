package com.example.keiller.celularesr;

/**
 * Created by keiller on 16/04/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {

    private ListView lstOpciones;
    private Resources res;
    private String opc[];
    private Intent i;
    private Context contexto;
    private String color[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lstOpciones = (ListView)findViewById(R.id.lstOpciones);
        res = this.getResources();
        contexto = this;
        color = res.getStringArray(R.array.colores);


        opc = res.getStringArray(R.array.opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc);

        lstOpciones.setAdapter(adapter);
        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                switch (pos){
                    case 0:
                        i = new Intent(Principal.this, Crear_Celulares.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(Principal.this, Listar.class);
                        startActivity(i);
                        break;
                    case 2:
                        ArrayList<Celular> celulares = Metodos.ram_Samsung(Datos.obtenerCelulares());
                        String mostrar = "";
                        for (int i = 0; i < celulares.size(); i++) {
                            mostrar += "[" + color[celulares.get(i).getColor()] + ", " + celulares.get(i).getRAM() + ", " + celulares.get(i).getPrecio()+ "]";
                        }
                        Toast.makeText(contexto, mostrar, Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(contexto, Metodos.apples_negros(Datos.obtenerCelulares())+"", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(contexto, Metodos.promedio_nokias(Datos.obtenerCelulares())+"", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(contexto, Metodos.huawei_blancos(Datos.obtenerCelulares())+"", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
    }

