package com.sanjeewa.appedit.DataAccessLayer;

import com.sanjeewa.appedit.models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDAL extends MongoRepository<UserModel, String> {

    @Query("SELECT u FROM User u WHERE u.firstname = :firstname")
    public String getsAll();
}
