package pl.sda.shop.orders;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersReporitory extends JpaRepository<Order,Long> {
}
