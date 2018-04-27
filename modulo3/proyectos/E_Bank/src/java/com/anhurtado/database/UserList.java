package com.anhurtado.database;
import com.anhurtado.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<User> lstUsers;

    public UserList() {
        this.lstUsers = new ArrayList();
        this.lstUsers.add(new User(1, "anhurtado", "123456"));
        this.lstUsers.add(new User(2, "mipico", "123456"));
    }

    public List<User> getLstUsers() {
        return lstUsers;
    }

    public void setLstUsers(List<User> lstUsers) {
        this.lstUsers = lstUsers;
    }
}
