package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.entities.Billing;
import com.crm.services.BillingService;

@Controller
public class BillingController {
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/generateBill")
	public String generateBill(Billing bill) {
		billingService.saveBill(bill);
		return "final_billing_info";
	}

}
