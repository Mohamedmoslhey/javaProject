package com.example.hp_pc.tasabeh;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by HP-PC on 7/19/2017.
 */

//this data base save Azkaar enter by user as option

public class DbAzkaary extends SQLiteOpenHelper {
    //name of table
    private static final String DB_Name = "أذكارى";
    // default for new database == 1
    private static final int DB_Version = 1 ;

    public DbAzkaary(Context context) {
        super(context,DB_Name, null , DB_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
