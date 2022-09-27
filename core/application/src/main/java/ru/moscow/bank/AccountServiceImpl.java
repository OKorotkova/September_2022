package ru.moscow.bank;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountStorage accountStorage;

    public AccountServiceImpl(AccountStorage accountStorage) {
        this.accountStorage = accountStorage;
    }

    @Override
    public List<Account> getAll() {
        return accountStorage.getAll();
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
