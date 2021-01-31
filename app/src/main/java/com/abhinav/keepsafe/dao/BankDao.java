package com.abhinav.keepsafe.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.abhinav.keepsafe.Constants;
import com.abhinav.keepsafe.entities.Bank;

import java.util.List;

/**
 * Created by abhinav.sharma on 07/10/17.
 */

@Dao
public interface BankDao {

    @Query("SELECT * FROM " + Constants.Database.T_BANK)
    LiveData<List<Bank>> getAllBanks();

    @Query("SELECT * FROM t_bank WHERE id = :id")
    LiveData<Bank> getBankDetails(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long addBank(Bank bank);

    @Update
    void updateBank(Bank bank);

    @Delete
    void deleteBank(Bank bank);
}
