package com.aziz.accountservice.mappers;

import com.aziz.accountservice.dto.BankAccountResponseDTO;
import com.aziz.accountservice.dto.BankAccountUpdateRequestTDO;
import com.aziz.accountservice.entities.BankAccount;
import org.mapstruct.Mapper;

@Mapper
public interface BankAccountMapper {
    BankAccountResponseDTO BankAccountToResponseDTO(BankAccount bankAccount);
    BankAccount RequestTDOToBankAccount(BankAccountUpdateRequestTDO bankAccountUpdateRequestTDO);
}
