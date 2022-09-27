package ru.moscow.bank;


import lombok.*;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String lastName;
    @NonNull
    private String firstName;

    private String middleName;

    @NonNull
    private String docType;
    @NonNull
    private String docNumber;

    private String birthDate;

}
