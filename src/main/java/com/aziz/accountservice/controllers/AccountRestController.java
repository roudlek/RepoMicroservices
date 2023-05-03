package com.aziz.accountservice.controllers;

import com.aziz.accountservice.entities.BankAccount;
import com.aziz.accountservice.enums.AccountType;
import com.aziz.accountservice.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class AccountRestController {
    @Autowired
    private BankAccountRepository bankAccountRepository;

    @GetMapping("/bankAccounts")
    public List<BankAccount> getAllBankAccounts(){
        return bankAccountRepository.findAll();
    }

    @GetMapping("/bankAccounts/{id}")
    public BankAccount getBankAccountById(@PathVariable String id){
        return bankAccountRepository.findById(id).orElseThrow(() -> new RuntimeException("account with id " + id + " is not found"));
    }
//@RequestBody is used to bind the request body to a method parameter, typically used to receive JSON or XML data in the
// request body. The request body is converted to a Java object using a message converter.
// This annotation is used for POST, PUT and PATCH requests.
    @PostMapping("/bankAccounts")
    public BankAccount addBankAccount (@RequestBody BankAccount bankAccount){
        if(bankAccount.getId() == null || bankAccount.getId().isEmpty()) {
            bankAccount.setId(java.util.UUID.randomUUID().toString());
        }
        if(bankAccount.getCreatedAt() == null) bankAccount.setCreatedAt(new Date());
        if(bankAccount.getType() == null || bankAccount.getType().name().isEmpty()) {
            bankAccount.setType(Math.random() * 10 < 5 ? AccountType.CURRENT_ACCOUNT : AccountType.SAVING_ACCOUNT);
        }
        return  bankAccountRepository.save(bankAccount);
    }
    @PutMapping("/bankAccounts/{id}")
    public BankAccount update(@PathVariable String id, @RequestBody BankAccount bankAccount) {

        BankAccount account = bankAccountRepository.findById(id).orElseThrow();
        // only update what was sent as value of the variable in json, so other variables value won\t be deleted
        // if values are null don't update anything
        if(bankAccount.getBalance() != null) account.setBalance(bankAccount.getBalance());
        if(bankAccount.getCreatedAt() != null) account.setCreatedAt(bankAccount.getCreatedAt());
        if(bankAccount.getType() != null) account.setType(bankAccount.getType());
        if(bankAccount.getCurrency() != null) account.setCurrency(bankAccount.getCurrency());
        return bankAccountRepository.save(account);
    }

    @DeleteMapping("bankAccounts/{id}")
    public void deleteAccount(@PathVariable String id){
        bankAccountRepository.deleteById(id);

    }
}




















