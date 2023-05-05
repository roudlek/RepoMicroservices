package com.aziz.accountservice.dto;

import com.aziz.accountservice.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccountResponseDTO {
// is like a getter for the entity
// It is designed to protect the domain model from unexpected data and avoid exposing internal implementation details.
// we send data back to the client
// we return this class as response
// For example, imagine an entity with sensitive information like a user's password hash or credit card number.
// We do not want to expose this information to the client in the API response,
// so we can create a separate Response DTO class that only includes the necessary information to return to the client.
//    private String id;
//    private Integer CCN;
    private Date createdAt;
    private Double balance;
    private String currency;
    private AccountType type;
}
