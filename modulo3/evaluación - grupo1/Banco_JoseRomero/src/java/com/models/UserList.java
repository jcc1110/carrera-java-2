package com.models;
import com.DataBase.User;
import java.util.ArrayList;
import java.util.List;


public class UserList {
    private List<User> lstUsers;
    
    public UserList() {
    this.lstUsers = new ArrayList();
    this.lstUsers.add(new User(1, "jromero", "123456"));
    this.lstUsers.add(new User(2, "castillo", "654321"));
    this.lstUsers.add(new User(3, "jose", "456789"));
    
    }

    public UserList(List<User> lstUsers) {
        this.lstUsers = lstUsers;
    }

    public List<User> getLstUsers() {
        return lstUsers;
    }
    
    
    
}
