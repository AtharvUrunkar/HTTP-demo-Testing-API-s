package com.example.demo.controllers;

import com.example.demo.model.Payment;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentControlller {

	private List<Payment> payments = new ArrayList<>();

	@PostMapping
	public String pay(@RequestBody Payment payment){
		payments.add(payment);
		return "Payment successful";
	}

	@GetMapping
	public List<Payment> getPayments(){
		return payments;
	}
}

