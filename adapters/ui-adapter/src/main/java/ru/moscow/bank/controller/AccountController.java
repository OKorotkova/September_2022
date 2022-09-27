package ru.moscow.bank.controller;



import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.moscow.bank.AccountService;
import ru.moscow.bank.Converter;
import ru.moscow.bank.view.AccountView;
import ru.moscow.bank.view.ClientView;

import java.util.List;

@RestController
@RequestMapping("api/bank/account")
@Slf4j
public class AccountController {

    private final AccountService accountService;
    private final Converter converter;


    public AccountController(AccountService accountService, Converter converter){
        this.accountService = accountService;
        this.converter = converter;
    }


    @GetMapping("/getAll")
    public List<AccountView> getAll() {
        return null;
    }

    @GetMapping("/get")
    public AccountView get(@RequestParam @NonNull Long id) {
        return (AccountView) converter.convert(accountService.get(id));
    }

    @PostMapping("/create")
    public Long createClient(@RequestBody AccountView newClient) {

        return null;
    }

    @GetMapping("/delete")
    public Long deleteClient(@RequestParam @NonNull Long id) {
        return null;
    }

}
