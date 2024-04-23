package com.example.etapa2;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {CompromissoEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CompromissoDao compromissoDao();
}

