package ru.moscow.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AccountStorageImpl implements AccountStorage {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Account> getAll() {
        return null;
    }

    @Override
    public Account get(Long id) {
        return null;
    }

    @Override
    public Long save(Account account) {
        return null;
    }

    @Override
    public Long delete(Long id) {
        return null;
    }
}
