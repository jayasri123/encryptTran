package com.encrypt.encryptTran.service;

import java.util.Base64;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.encrypt.encryptTran.model.Transaction;

@Service
public class EncryptTranService {
	
	public String saveTransaction(Transaction transaction) {
		if(transaction.getAccountNumber()=="" || transaction.getAccountNumber()==null)
		{
			return "account number sould not be null or emty";
		}
		if(transaction.getAccountFrom()==""||transaction.getAccountFrom()==null)
		{
			return "From account number sould not be null or emty";
		}
		if(transaction.getCurrency()==""||transaction.getCurrency()==null)
		{
			return "currency sould not be null or emty";
		}
		if(transaction.getType()==""||transaction.getType()==null)
		{
			return "account type should not be null or emty";
		}
		if(transaction.getAmount()==""||transaction.getAmount()==null)
		{
			return "account number sould not be null or emty";
		}
		if(Pattern.matches("^[a-zA-Z]*$",transaction.getAmount()))
		{
			return "Invalid amount";
		}
		RestTemplate template = new RestTemplate();
	    return template.postForEntity("http://localhost:8080/transaction", 
	    		encryptTran(transaction), Transaction.class).getBody().toString();
	}
	
	public static Transaction encryptTran(Transaction transaction) {
		Transaction encryptedTran = new Transaction();
		encryptedTran.setAccountNumber(Base64.getEncoder().encodeToString(transaction.getAccountNumber().getBytes()));
		encryptedTran.setType(Base64.getEncoder().encodeToString(transaction.getType().getBytes()));
		encryptedTran.setAmount(Base64.getEncoder().encodeToString(transaction.getAmount().getBytes()));
		encryptedTran.setCurrency(Base64.getEncoder().encodeToString(transaction.getCurrency().getBytes()));
		encryptedTran.setAccountFrom(Base64.getEncoder().encodeToString(transaction.getAccountFrom().getBytes()));
		return encryptedTran;
	}
}
