package org.howard.edu.lsp.oopfinal.question2;

public class PayPalPayment implements PaymentStrategy {
	private String emailAddress;
	
	public PayPalPayment(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void pay(double amount) {
		System.out.printf("Paid %.2f using Paypal account %s%n",amount,emailAddress);
	}

}
