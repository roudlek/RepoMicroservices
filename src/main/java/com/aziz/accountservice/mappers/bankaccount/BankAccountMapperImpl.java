package com.aziz.accountservice.mappers.bankaccount;

import com.aziz.accountservice.dto.BankAccountResponseDTO;
import com.aziz.accountservice.dto.BankAccountUpdateRequestTDO;
import com.aziz.accountservice.entities.BankAccount;
import com.aziz.accountservice.mappers.BankAccountMapper;

public class BankAccountMapperImpl implements BankAccountMapper {

    @Override
    public BankAccountResponseDTO BankAccountToResponseDTO(BankAccount bankAccount) {
        return null;
    }

    @Override
    public BankAccount RequestTDOToBankAccount(BankAccountUpdateRequestTDO bankAccountUpdateRequestTDO) {
        return null;
    }
}
