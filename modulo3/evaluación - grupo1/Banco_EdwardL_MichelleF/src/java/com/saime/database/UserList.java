package com.saime.database;
import com.saime.models.User;
import java.util.ArrayList;
import java.util.List;
import com.saime.database.UserList;

/**
 *
 * @author evento
 */
public class UserList {
    private List<User> lstUsers;

    public UserList() {
        this.lstUsers = new ArrayList();
        this.lstUsers.add(new User(1, "iguano", "666", "Camarada", "Mesmo"));
        this.lstUsers.add(new User(2, "dpal", "123", "Denny", "Palacio"));
        this.lstUsers.add(new User(3, "cdr", "12345", "Caristrobulo", "Distrudis"));
    }

    public List<User> getLstUsers() {
        return lstUsers;
    }

    public void setLstUsers(List<User> lstUsers) {
        this.lstUsers = lstUsers;
    }
}
