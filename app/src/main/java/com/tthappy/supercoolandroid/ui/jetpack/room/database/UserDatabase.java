package com.tthappy.supercoolandroid.ui.jetpack.room.database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.tthappy.supercoolandroid.ui.jetpack.room.dao.UserDao;
import com.tthappy.supercoolandroid.ui.jetpack.room.entities.User;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/9 15:08
 * Update Date:
 * Modified By:
 * Description:
 */
@Database(entities = { User.class }, version = 1,exportSchema = false)
public class UserDatabase extends RoomDatabase {

    @NonNull
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @NonNull
    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

    @Override
    public void clearAllTables() {

    }
}
