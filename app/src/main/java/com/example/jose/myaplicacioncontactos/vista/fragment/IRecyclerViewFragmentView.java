package com.example.jose.myaplicacioncontactos.vista.fragment;


import com.example.jose.myaplicacioncontactos.adapter.ContactoAdaptador;
import com.example.jose.myaplicacioncontactos.pojo.Contacto;

import java.util.ArrayList;


public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();
    public void generarGridLayout();

    public ContactoAdaptador crearAdaptador(ArrayList<Contacto> contactos);

    public void inicializarAdaptadorRV(ContactoAdaptador adaptador);
}
