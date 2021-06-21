package com.igorpdev.hrpayroll.services;

import com.igorpdev.hrpayroll.entities.Payment;
import com.igorpdev.hrpayroll.entities.Worker;
import com.igorpdev.hrpayroll.feignclients.WorkerFeignClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getNome(), worker.getDailyIncome(), days);
	}
}
