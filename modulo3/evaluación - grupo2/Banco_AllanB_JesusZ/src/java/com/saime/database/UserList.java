package com.saime.database;

import com.saime.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserList {
    //Atributos
    private List<User> lstUser;

    //Metodos
    public List<User> getLstUser() {
        return lstUser;
    }

    public void setLstUser(List<User> lstUser) {
        this.lstUser = lstUser;
    }
    
    public  UserList(){
        this.lstUser = new ArrayList();
        this.lstUser.add(new User(1, "jesus", "123456"));
        this.lstUser.add(new User(2, "allan", "123456"));
        this.lstUser.add(new User(3, "anthony", "123456"));
        this.lstUser.add(new User(4, "jose", "123456"));
    }
    
}
