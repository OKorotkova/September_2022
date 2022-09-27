package ru.moscow.bank.view;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountView {

    private String accountNumber;
    private String currency;

}
