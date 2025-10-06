package com.Prathamesh.Payment_Gateway.repo;

import com.Prathamesh.Payment_Gateway.entity.PaymentOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<PaymentOrder,Long> {
    PaymentOrder findByOrderId(String orderId);
}
