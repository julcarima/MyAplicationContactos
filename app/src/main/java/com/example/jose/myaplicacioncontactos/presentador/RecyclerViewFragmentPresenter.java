package com.example.jose.myaplicacioncontactos.presentador;

import android.content.Context;

import com.example.jose.myaplicacioncontactos.db.ConstructorContactos;
import com.example.jose.myaplicacioncontactos.pojo.Contacto;
import com.example.jose.myaplicacioncontactos.vista.fragment.IRecyclerViewFragmentView;
import com.example.jose.myaplicacioncontactos.vista.fragment.RecyclerViewFragment;

import java.util.ArrayList;


public class RecyclerViewFragmentPresenter implements IRecylerViewFragmentPresenter {

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorContactos constructorContactos;
    private ArrayList<Contacto> contactos;

    public  RecyclerViewFragmentPresenter(RecyclerViewFragment iRecyclerViewFragmentView, Context context) {
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerContactos();
    }

    @Override
    public void obtenerContactos() {
        constructorContactos = new ConstructorContactos(context);
        contactos = constructorContactos.obtenerDatos();
        mostrarContactosRV();
    }


    @Override
    public void mostrarContactosRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(contactos));
        iRecyclerViewFragmentView.generarLinearLayoutVertical();
    }
}
