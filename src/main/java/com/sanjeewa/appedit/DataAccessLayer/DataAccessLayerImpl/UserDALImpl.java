package com.sanjeewa.appedit.DataAccessLayer.DataAccessLayerImpl;

import com.sanjeewa.appedit.DataAccessLayer.UserDAL;
import com.sanjeewa.appedit.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDALImpl implements UserDAL {

    private UserModel userModel;

    public UserDALImpl(UserModel userModel){
        this.userModel = userModel;
    }

    @Override
    public String getsAll() {
        return null;
    }
}
