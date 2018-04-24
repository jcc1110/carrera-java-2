package com.DataBase;
import com.DataBase.User;
import com.models.UserList;


public class DataAccessUser {
    public boolean UserValidate(String username, String password){
    UserList ul= new UserList();
    boolean isValid= false;
    
    for(User user : ul.getLstUsers()){
        if (user.getUsername().equals(username) &&
                user.getPassword().equals(password)) {
        isValid= true;        
        }
    }
    return isValid;
    }
    
        }

    

