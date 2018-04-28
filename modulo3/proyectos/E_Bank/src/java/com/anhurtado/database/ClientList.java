package com.anhurtado.database;

import com.anhurtado.models.Client;
import com.anhurtado.models.User;
import java.util.ArrayList;
import java.util.List;

public class ClientList {

    private List<User> lstClients;

    public ClientList() {
        this.lstClients = new ArrayList();
        this.lstClients.add(
                new Client(
                    "anhurtado",
                    "Anthony",
                    "Hurtado",
                    "anhurtado@outlook.com",
                    5556262,
                    1000.90));
        this.lstClients.add(
                new Client(
                    "mipico",
                    "Mirna",
                    "Pico",
                    "osomp@hotmail.com",
                    6668585,
                    1000.80));
    }

    public List<User> getLstClients() {
        return lstClients;
    }

    public void setLstClients(List<User> lstClients) {
        this.lstClients = lstClients;
    }
}
