package com.example.jose.myaplicacioncontactos.vista.fragment;


import com.example.jose.myaplicacioncontactos.adapter.ContactoAdaptador;
import com.example.jose.myaplicacioncontactos.pojo.Contacto;

import java.util.ArrayList;

/**
 * Created by anahisalgado on 21/04/16.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public ContactoAdaptador crearAdaptador(ArrayList<Contacto> contactos);

    public void inicializarAdaptadorRV(ContactoAdaptador adaptador);
}
