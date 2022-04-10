package com.encrypt.encryptTran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.encrypt.encryptTran.model.Transaction;
import com.encrypt.encryptTran.service.EncryptTranService;

@RestController
@RequestMapping("transaction")
public class EncryptTranController 
{
	@Autowired
	private EncryptTranService encryptTranService;
		
	@PostMapping
	public ResponseEntity<String> addTransaction(@RequestBody Transaction transaction) {
			String response = encryptTranService.saveTransaction(transaction);
			return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}
