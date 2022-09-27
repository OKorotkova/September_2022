package ru.moscow.bank;

import java.util.List;

public interface ClientService {

    List<Client> getAll();

    Client get(Long id);

    Long save(Client client);

    Long delete(Long id);


}
