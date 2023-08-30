package com.aziz.accountservice;

import com.aziz.accountservice.entities.BankAccount;
import com.aziz.accountservice.enums.AccountType;
import com.aziz.accountservice.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Date;

@SpringBootApplication
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}
	// acomment

	@Autowired
	private BankAccountRepository bankAccountRepository;
	@PostConstruct
	public void init(){
		for(int i = 0; i < 10 ; i++){
			BankAccount bankAccount = BankAccount.builder()
					.id(java.util.UUID.randomUUID().toString())
					.createdAt(new Date())
					.balance(Math.random() + 10000 * Math.random())
					.currency("Mad")
					.type(Math.random() * 10 < 5 ? AccountType.CURRENT_ACCOUNT : AccountType.SAVING_ACCOUNT)
					.build();
			System.out.println(bankAccount.toString());
			bankAccountRepository.save(bankAccount);
		}
	}
}
