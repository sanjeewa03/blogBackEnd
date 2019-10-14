package com.sanjeewa.appedit.services.servicesImpl;

import com.sanjeewa.appedit.DataAccessLayer.UserDAL;
import com.sanjeewa.appedit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAL userDAL;

    @Override
    public String getAll() {
        return userDAL.getAll();
    }
}
