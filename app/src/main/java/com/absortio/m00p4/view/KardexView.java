package com.absortio.m00p4.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.absortio.m00p4.R;
import com.absortio.m00p4.adapter.KardexAdapter;
import com.absortio.m00p4.model.Custom;
import com.absortio.m00p4.model.Kardex;
import com.absortio.m00p4.utils.Service;
import com.absortio.m00p4.utils.ServiceInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ruggi on 11/21/17.
 */

public class KardexView extends AppCompatActivity {
    List<Custom> customs;
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    Context context;
    ServiceInterface serviceInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        serviceInterface= Service.userService();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kardex);

        customs=  new ArrayList<>();
        context=this;

        recycler =findViewById(R.id.reciclador);
       // recycler.setHasFixedSize(true);

        lManager = new LinearLayoutManager(context);
        recycler.setLayoutManager(lManager);




    }
    @Override
    protected void onStart() {
        super.onStart();
        serviceInterface.getCustom().enqueue(new Callback<ArrayList<Custom>>() {
            @Override
            public void onResponse(Call<ArrayList<Custom>> call, Response<ArrayList<Custom>> response) {
                customs=response.body();
                adapter = new KardexAdapter(customs);
                recycler.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<Custom>> call, Throwable t) {
                System.out.println("AQUIII"+t);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.add) {

           load();
        }
        return super.onOptionsItemSelected(item);
    }
    public void load(){
        serviceInterface.getCustom().enqueue(new Callback<ArrayList<Custom>>() {
            @Override
            public void onResponse(Call<ArrayList<Custom>> call, Response<ArrayList<Custom>> response) {
                customs=response.body();
                adapter = new KardexAdapter(customs);
                recycler.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<Custom>> call, Throwable t) {
                System.out.println("AQUIII"+t);
            }
        });
    }

}
