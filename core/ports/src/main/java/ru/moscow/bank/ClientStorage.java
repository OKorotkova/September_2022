package ru.moscow.bank;

import java.util.List;

public interface ClientStorage {
    List<Client> getAll();

    Long save(Client client);

    Long delete(Long id);

    Client get(Long id);
}
