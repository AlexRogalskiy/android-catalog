package com.abhinav.keepsafe.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.abhinav.keepsafe.Constants;
import com.abhinav.keepsafe.entities.ECommerce;

import java.util.List;

/**
 * Created by abhinav.sharma on 13/10/17.
 */

@Dao
public interface ECommerceDao {

    @Query("SELECT * FROM " + Constants.Database.T_ECOMMERCE)
    LiveData<List<ECommerce>> getAllECommerceAccounts();

    @Query("SELECT * FROM t_ecommerce WHERE id = :id")
    LiveData<ECommerce> getECommerceDetails(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long addECommerce(ECommerce eCommerce);

    @Update
    void updateECommerce(ECommerce eCommerce);

    @Delete
    void deleteECommerce(ECommerce eCommerce);
}
