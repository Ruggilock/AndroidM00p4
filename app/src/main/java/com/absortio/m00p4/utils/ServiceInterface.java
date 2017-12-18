package com.absortio.m00p4.utils;

import com.absortio.m00p4.model.Custom;
import com.absortio.m00p4.model.Kardex;
import com.absortio.m00p4.model.Usuario;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ruggi on 11/22/17.
 */

public interface ServiceInterface {
    @GET("findAllUsuario")
    Call<ArrayList<Usuario>>getUsers();

    @GET("findAllKardex")
    Call<ArrayList<Kardex>>getKardex();

    @GET("findAllMyKardex")
    Call<ArrayList<Custom>>getCustom();


}
