package com.tthappy.supercoolandroid.ui.jetpack.room.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.tthappy.supercoolandroid.ui.jetpack.room.entities.User;

import java.util.List;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/9 15:00
 * Update Date:
 * Modified By:
 * Description:
 */
@Dao
public interface  UserDao {

    @Query("SELECT * FROM user")
    List<User> getUsers();

    @Insert
    void insert(User... users);

    @Update
    void update(User... users);

    @Delete
    void delete(User... users);

}
