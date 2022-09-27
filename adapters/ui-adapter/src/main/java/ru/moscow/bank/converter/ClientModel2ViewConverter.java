package ru.moscow.bank.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.moscow.bank.Client;
import ru.moscow.bank.Converter;
import ru.moscow.bank.view.ClientView;

@Component
public class ClientModel2ViewConverter implements Converter<Client, ClientView> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ClientView convert(Client source) {
        return modelMapper.map(source, ClientView.class);
    }
}
