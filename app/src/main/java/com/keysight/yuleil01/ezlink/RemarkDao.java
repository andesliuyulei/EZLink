package com.keysight.yuleil01.ezlink;


import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface RemarkDao
{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Remark remark);

    @Query("DELETE FROM remark_table")
    void deleteAll();

    @Query("SELECT * from remark_table ORDER BY remark ASC")
    LiveData<List<Remark>> getAllElements();
}
