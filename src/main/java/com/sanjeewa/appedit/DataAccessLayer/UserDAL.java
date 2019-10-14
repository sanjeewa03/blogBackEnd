package com.sanjeewa.appedit.DataAccessLayer;

import com.sanjeewa.appedit.models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDAL extends MongoRepository<UserModel, String> {


    public String getAll();
}
