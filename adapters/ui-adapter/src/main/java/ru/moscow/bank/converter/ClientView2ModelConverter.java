package ru.moscow.bank.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.moscow.bank.Client;
import ru.moscow.bank.Converter;
import ru.moscow.bank.view.ClientView;

import java.util.Optional;

@Component
public class ClientView2ModelConverter implements Converter<ClientView, Client> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Client convert(ClientView source) {
        return modelMapper.map(source, Client.class);
    }
}
