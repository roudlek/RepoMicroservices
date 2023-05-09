package com.aziz.accountservice.mappers;

import com.aziz.accountservice.dto.BankAccountResponseDTO;
import com.aziz.accountservice.dto.BankAccountUpdateRequestTDO;
import com.aziz.accountservice.entities.BankAccount;
import com.aziz.accountservice.enums.AccountType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Date;

@Mapper
public interface BankAccountMapper {
    BankAccountMapper INSTANCE = Mappers.getMapper(BankAccountMapper.class);
    @Mapping(target = "createdAt", source = "bankAccount.createdAt")
    @Mapping(target = "balance", source = "bankAccount.balance")
    @Mapping(target = "currency", source = "bankAccount.currency")
    @Mapping(target = "type", source = "bankAccount.type")
    BankAccountResponseDTO BankAccountToResponseDTO(BankAccount bankAccount);


    // source is the class that we will get the data from
    // target is the class that will receive data in this case bankAccount

    @Mapping(target = "balance", source = "bankAccountUpdateRequestTDO.balance")
    @Mapping(target = "currency", source = "bankAccountUpdateRequestTDO.currency")
    @Mapping(target = "type", source = "bankAccountUpdateRequestTDO.type")
    BankAccount RequestTDOToBankAccount(BankAccountUpdateRequestTDO bankAccountUpdateRequestTDO);

//    @Mapping(target = "balance",source = "requestTDO.balance")
//    @Mapping(target = "currency",source = "requestTDO.currency")
//    @Mapping(target = "type",source = "requestTDO.type")
//    BankAccountResponseDTO convertRequestTDOToResponseTDO(BankAccountUpdateRequestTDO requestTDO);
}
