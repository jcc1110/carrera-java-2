package com.saime.database;
import com.saime.models.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class UserList {
    private List<User> lstUsers;

    public UserList() {
        this.lstUsers = new ArrayList();
        this.lstUsers.add(new User(1, "cpalacio", "12345", "", ""));
        this.lstUsers.add(new User(2, "jbautista", "12345", "", ""));
        this.lstUsers.add(new User(3, "jgalia", "12345", "", ""));
        
    }

    public List<User> getLstUsers() {
        return lstUsers;
    }

    public void setLstUsers(List<User> lstUsers) {
        this.lstUsers = lstUsers;
    }
}
