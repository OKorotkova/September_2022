package ru.moscow.bank.view;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientView {
    private String lastName;
    private String firstName;
    private String middleName;
    private String docType;
    private String docNumber;
    private String birthDate;
}
