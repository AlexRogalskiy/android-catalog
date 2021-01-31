package com.abhinav.keepsafe.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.abhinav.keepsafe.Constants;
import com.abhinav.keepsafe.entities.Email;

import java.util.List;

/**
 * Created by abhinav.sharma on 07/10/17.
 */

@Dao
public interface EmailDao {

    @Query("SELECT * FROM " + Constants.Database.T_EMAIL)
    LiveData<List<Email>> getAllEmails();

    @Query("SELECT * FROM t_email WHERE id = :id")
    LiveData<Email> getEmailDetails(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long addEmail(Email email);

    @Update
    void updateEmail(Email email);

    @Delete
    void deleteEmail(Email email);
}
