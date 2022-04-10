package com.encrypt.encryptTran.service;

import org.springframework.stereotype.Service;


import com.encrypt.encryptTran.model.Transaction;

@Service
public class EncryptTranService {
	
	public String saveTransaction(Transaction transaction) {
		return transaction.toString();
	}
}
