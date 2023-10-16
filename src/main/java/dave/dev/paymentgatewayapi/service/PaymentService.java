package dave.dev.paymentgatewayapi.service;

import dave.dev.paymentgatewayapi.model.Payment;

import java.util.List;

public interface PaymentService {
    Payment processPayment(Payment payment);
    List<Payment> getAllPayments();
}
