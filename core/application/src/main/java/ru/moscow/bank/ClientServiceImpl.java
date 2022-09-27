package ru.moscow.bank;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    private final ClientStorage clientStorage;

    public ClientServiceImpl(ClientStorage clientStorage) {
        this.clientStorage = clientStorage;
    }

    @Override
    public List<Client> getAll() {
        return clientStorage.getAll();
    }

    @Override
    public Client get(Long id) {
        return null;
    }

    @Override
    public Long save(Client client) {
        return null;
    }

    @Override
    public Long delete(Long id) {
        return null;
    }
}
