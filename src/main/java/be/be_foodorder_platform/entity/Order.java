package be.be_foodorder_platform.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.Date;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    Integer order_id;

    @Column(name = "customerName", nullable = false, columnDefinition = "nvarchar(50)")
    String customerName;

    @Column(name = "totalPrice", nullable = false, columnDefinition = "decimal(10,2)")
    Double totalPrice;

    @Column(name = "phoneNumber", nullable = false, columnDefinition = "nvarchar(50)")
    String phoneNumber;

    @Column(name = "orderDate", nullable = false, columnDefinition = "datetime")
    Date orderDate;

    @Column(name = "status", nullable = false, columnDefinition = "nvarchar(50)")
    @Enumerated(EnumType.STRING)
    StatusOrder status;
}
