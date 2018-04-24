package com.saime.database;
import com.saime.models.User;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Jelitza Mena
 */
public class UserList {
    private List<User> lstUsers;

    public UserList() {
        this.lstUsers = new ArrayList();
        this.lstUsers.add(new User(1, "jelitzamena", "123456", "JELITZA", "ELOISA", "MENA", "VILLORIA", "0414-365-94-77", "jelitzamena@gmail.com", "0102-0235-33-0000140232",1550.35));
        this.lstUsers.add(new User(2, "mariaperez", "654321","MARIA", "TERESA", "MELENDEZ", "GOMEZ", "0426-352-89-74", "mariaperez@hotmail.com", "0102-0415-55-0000789456",2500.50));
    }

    public List<User> getLstUsers() {
        return lstUsers;
    }

    public void setLstUsers(List<User> lstUsers) {
        this.lstUsers = lstUsers;
    }
    
}
