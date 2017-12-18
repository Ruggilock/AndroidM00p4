package com.absortio.m00p4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.absortio.m00p4.model.Usuario;
import com.absortio.m00p4.utils.Service;
import com.absortio.m00p4.utils.ServiceInterface;
import com.absortio.m00p4.view.KardexView;
import com.absortio.m00p4.view.OptionsView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText user;
    EditText password;
    Button ingresar;
    ServiceInterface serviceInterface;
    List<Usuario> usuarios;
    Boolean esta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        usuarios = new ArrayList<>();
        serviceInterface = Service.userService();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.correo);
        password = findViewById(R.id.passwrod);
        ingresar = findViewById(R.id.ingresar);
        final Context context = this;
        esta =false;

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (Usuario usuario : usuarios) {
                    if (usuario.getCorreo().compareTo(user.getText().toString()) == 0 &&
                        usuario.getContrasena().compareTo(password.getText().toString()) == 0) {
                        esta = true;
                        Intent intent = new Intent(context,OptionsView.class);
                        startActivity(intent);
                        break;
                    }
                }
                if(!esta){
                    CharSequence text = "Datos incorrectos";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        serviceInterface.getUsers().enqueue(new Callback<ArrayList<Usuario>>() {
            @Override
            public void onResponse(Call<ArrayList<Usuario>> call, Response<ArrayList<Usuario>> response) {
                if (response.isSuccessful()) {
                    usuarios = response.body();
                } else {
                    int statusCode = response.code();
                }
            }
            @Override
            public void onFailure(Call<ArrayList<Usuario>> call, Throwable t) {

            }
        });
    }

}
