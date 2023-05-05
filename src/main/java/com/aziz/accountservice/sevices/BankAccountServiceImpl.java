package com.aziz.accountservice.sevices;

import com.aziz.accountservice.dto.BankAccountResponseDTO;
import com.aziz.accountservice.dto.BankAccountUpdateRequestTDO;
import com.aziz.accountservice.entities.BankAccount;

public interface BankAccountServiceImpl {
//    public BankAccountUpdateRequestTDO convertEntitytoBankAccountUpdateRequestTDO(BankAccount bankAccount);
    public BankAccountResponseDTO convertEntityTOBankAccountResponseDTO(BankAccount bankAccount,BankAccountResponseDTO bankAccountResponseDTO);
    public BankAccountResponseDTO addBankAccountInService(BankAccountUpdateRequestTDO bankAccountTDO);
}
