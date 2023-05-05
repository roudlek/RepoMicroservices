package com.aziz.accountservice.entities;

import com.aziz.accountservice.enums.AccountType;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccount {
    @Id
    private String id;
    private Date createdAt;
    private Double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    // Credit card number
    private Integer CCN;
}
//
