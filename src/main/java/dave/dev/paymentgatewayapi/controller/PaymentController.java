package dave.dev.paymentgatewayapi.controller;

import dave.dev.paymentgatewayapi.model.Payment;
import dave.dev.paymentgatewayapi.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/process")
    public Payment processPayment(@RequestBody Payment payment) {
        return paymentService.processPayment(payment);
    }

    @GetMapping("/list")
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }
}
