package com.example.boyso996.smartphonenote.modelo;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by BOYSO996 on 13/10/2017.
 */

public class Adapter_SQLiteOpenHelper extends SQLiteOpenHelper {
    private final int DB_VERSION=1;
    private final String  SCRIPT_DB = "create table Tarea (" +
            "_id integer primary key, titulo text not null," +
            "descripcion text, tipo integer, " +
            "fecha_hora text," +
            "fecha_hora_vencimineto integer); " +
            "create table multimedia (" +
            "_idNotaTarea  integer references Tarea(_id), " +
            "titulo text, " +
            "tipo integer not null, " +
            "uri text not null" +
            ");" +

            "create table recordatorios (_idTarea integer reference Tarea(_id)," +
            "fecha_hora) text  not null";

    public Adapter_SQLiteOpenHelper(Context context, int version) {

        super(context, "db", null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SCRIPT_DB);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
