package ru.moscow.bank.controller;



import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.moscow.bank.Client;
import ru.moscow.bank.ClientService;
import ru.moscow.bank.Converter;
import ru.moscow.bank.view.ClientView;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/bank/client")
@Slf4j
public class ClientController {

    private final ClientService clientService;
    private final Converter converter;

    public ClientController(ClientService clientService, Converter converter) {
        this.clientService = clientService;
        this.converter = converter;
    }


    @GetMapping("/getAll")
    public List<ClientView> getAll() {
        return clientService.getAll().stream().map(client -> (ClientView) converter.convert(client)).collect(Collectors.toList());
    }

    @GetMapping("/get")
    public ClientView get(@RequestParam @NonNull Long id) {
        return (ClientView) converter.convert(clientService.get(id));
    }

    @PostMapping("/create")
    public Long create(ClientView view) {
        Client newClient = (Client) converter.convert(view);
        return clientService.save(newClient);
    }

    @GetMapping("/delete")
    public Long delete(@RequestParam @NonNull Long id) {
        return clientService.delete(id);
    }

}
