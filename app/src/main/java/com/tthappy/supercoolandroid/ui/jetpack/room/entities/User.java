package com.tthappy.supercoolandroid.ui.jetpack.room.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/9 14:58
 * Update Date:
 * Modified By:
 * Description:
 */
@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
