package com.absortio.m00p4.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.absortio.m00p4.R;
import com.absortio.m00p4.model.Kardex;
import com.absortio.m00p4.utils.Service;
import com.absortio.m00p4.utils.ServiceInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ruggi on 11/23/17.
 */

public class OptionsView extends AppCompatActivity {
    Button productos;
    Button kardex;
    Context context;
    ServiceInterface serviceInterface;
    List<Kardex> kardexs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        kardexs = new ArrayList<>();
        serviceInterface= Service.userService();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        productos = findViewById(R.id.productos);
        kardex = findViewById(R.id.kardex);
        context = this;
        productos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence text = "Falta implementar =(";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });
        kardex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,KardexView.class);
                startActivity(intent);
            }
        });
    }

}
