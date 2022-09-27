package ru.moscow.bank.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.moscow.bank.Account;
import ru.moscow.bank.Client;
import ru.moscow.bank.Converter;
import ru.moscow.bank.view.AccountView;
import ru.moscow.bank.view.ClientView;

@Component
public class AccountModel2ViewConverter implements Converter<Account, AccountView> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public AccountView convert(Account source) {
        return modelMapper.map(source, AccountView.class);
    }
}
