package ru.moscow.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientStorageImpl implements ClientStorage{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Client> getAll() {
        return null;
    }

    @Override
    public Long delete(Long id) {
        return null;
    }

    @Override
    public Client get(Long id) {
        return null;
    }

    @Override
    public Long save(Client client) {
        return null;
    }
}
