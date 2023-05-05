package com.aziz.accountservice.sevices;

import com.aziz.accountservice.dto.BankAccountResponseDTO;
import com.aziz.accountservice.dto.BankAccountUpdateRequestTDO;
import com.aziz.accountservice.entities.BankAccount;
import com.aziz.accountservice.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class BankAccountService implements BankAccountServiceImpl {

    @Autowired
    private BankAccountRepository bankAccountRepository;

//@Override
//    public BankAccountUpdateRequestTDO convertEntitytoBankAccountUpdateRequestTDO(BankAccount bankAccount){
//        BankAccountUpdateRequestTDO bankAccountUpdateRequestTDO = new BankAccountUpdateRequestTDO();
//        bankAccountUpdateRequestTDO.setBalance(bankAccount.getBalance());
//        bankAccountUpdateRequestTDO.setType(bankAccount.getType());
//        bankAccountUpdateRequestTDO.setCurrency(bankAccount.getCurrency());
//        return  bankAccountUpdateRequestTDO;
//    }


    @Override
    public BankAccountResponseDTO convertEntityTOBankAccountResponseDTO(BankAccount bankAccount,BankAccountResponseDTO bankAccountResponseDTO){
        bankAccountResponseDTO.setBalance(bankAccount.getBalance());
        bankAccountResponseDTO.setType(bankAccount.getType());
        bankAccountResponseDTO.setCurrency(bankAccount.getCurrency());
        bankAccountResponseDTO.setCreatedAt(bankAccount.getCreatedAt());
        return bankAccountResponseDTO;
    }
    @Override
    public BankAccountResponseDTO addBankAccountInService(BankAccountUpdateRequestTDO bankAccountUpdateRequestTDO) {
    BankAccount bankAccount = new BankAccount();
    bankAccount.setId(UUID.randomUUID().toString());
    bankAccount.setCreatedAt(new Date());
    // we get data from bankAccountRequestDTO, then we inject it to bank account
    bankAccount.setCurrency(bankAccountUpdateRequestTDO.getCurrency());
    bankAccount.setBalance(bankAccountUpdateRequestTDO.getBalance());
    bankAccount.setType(bankAccountUpdateRequestTDO.getType());
    BankAccount savedBankAccount =  bankAccountRepository.save(bankAccount);

    BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();

    // to display  necessary data, we convert entity to bankAccountResponseDTO
    // and we return bankAccountResponseDTO object
    convertEntityTOBankAccountResponseDTO(savedBankAccount , bankAccountResponseDTO);
//    bankAccountResponseDTO.setCreatedAt(bankAccount.getCreatedAt());
//    bankAccountResponseDTO.setType(bankAccount.getType());
//    bankAccountResponseDTO.setCurrency(bankAccount.getCurrency());
//    bankAccountResponseDTO.setBalance(bankAccount.getBalance());

        return bankAccountResponseDTO;
    }


}
