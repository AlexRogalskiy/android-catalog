package com.abhinav.keepsafe.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.abhinav.keepsafe.Constants;
import com.abhinav.keepsafe.entities.SocialNetwork;

import java.util.List;

/**
 * Created by abhinav.sharma on 13/10/17.
 */

@Dao
public interface SocialNetworkDao {
    @Query("SELECT * FROM " + Constants.Database.T_SOCIAL_NETWORK)
    LiveData<List<SocialNetwork>> getAllSocialNetworkAccounts();

    @Query("SELECT * FROM t_social_network WHERE id = :id")
    LiveData<SocialNetwork> getSocialNetworkDetails(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long addSocialNetwork(SocialNetwork socialNetwork);

    @Update
    void updateSocialNetwork(SocialNetwork socialNetwork);

    @Delete
    void deleteSocialNetwork(SocialNetwork socialNetwork);
}
