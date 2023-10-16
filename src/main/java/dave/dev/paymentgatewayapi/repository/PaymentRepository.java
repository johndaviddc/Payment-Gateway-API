package dave.dev.paymentgatewayapi.repository;

import dave.dev.paymentgatewayapi.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
