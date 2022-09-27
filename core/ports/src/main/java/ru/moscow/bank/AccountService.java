package ru.moscow.bank;

import java.util.List;

public interface AccountService {

    List<Account> getAll();

    Account get(Long id);

    Long save(Account account);

    Long delete(Long id);
}
