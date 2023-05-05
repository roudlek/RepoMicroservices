package com.aziz.accountservice.dto;

import com.aziz.accountservice.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccountUpdateRequestTDO {
    // is like a setter for the entity
    // this shows only necessary data
    // we will only allow updating the following variables
    // we receive data to from the client update it
    private Double balance;
    private String currency;
    private AccountType type;
}
