package com.example.jose.myaplicacioncontactos.db;

import android.content.ContentValues;
import android.content.Context;

import com.example.jose.myaplicacioncontactos.R;
import com.example.jose.myaplicacioncontactos.pojo.Contacto;

import java.util.ArrayList;


public class ConstructorContactos{

    private static final int LIKE = 1;
    private Context context;
    public ConstructorContactos(Context context) {
        this.context = context;
    }


    public ArrayList<Contacto> obtenerDatos(){
        /*ArrayList<Contacto> contactos = new ArrayList<>();
        contactos.add(new Contacto(R.drawable.candy_icon, "Neko Chan", "96548461", "NekoChan@gmail.com", 5));
        contactos.add(new Contacto(R.drawable.yammi_banana_icon, "Inu Chan", "5648584", "InuChan@gmail.com", 3));
        contactos.add(new Contacto(R.drawable.shock_rave_bonus_icon, "Mar", "889456465", "Mar@gmail.com", 8));
        contactos.add(new Contacto(R.drawable.forest_mushroom_icon, "Dark Black", "48485464", "DarkBlack@gmail.com", 9));
        return contactos;*/

        BaseDatos db = new BaseDatos(context);
        insertarTresContactos(db);
        return db.obtenerTodosLosContactos();
    }

    public void insertarTresContactos(BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_NOMBRE, "Neko Chan");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_TELEFONO, "96548461");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_EMAIL, "NekoChan@gmail.com");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_FOTO, R.drawable.candy_icon);

        db.insertarContacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_NOMBRE, "Inu Chan");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_TELEFONO, "5648584");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_EMAIL, "InuChan@gmail.com");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_FOTO, R.drawable.yammi_banana_icon);

        db.insertarContacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_NOMBRE, "Mar");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_TELEFONO, "889456465");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_EMAIL, "Mar@gmail.com");
        contentValues.put(ConstantesBaseDatos.TABLE_CONTACTS_FOTO, R.drawable.shock_rave_bonus_icon);

        db.insertarContacto(contentValues);
    }

    public void darLikeCotnacto(Contacto contacto){
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_CONTACT_ID_CONTACTO, contacto.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_CONTACT_NUMERO_LIKES, LIKE);
        db.insertarLikeContacto(contentValues);
    }

    public int obtenerLikesContacto(Contacto contacto){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesContacto(contacto);
    }
}