package be.be_foodorder_platform.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Table(name = "address_order")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddressOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_order_id")
    Integer addressOrderId;

    @Column(name = "province", columnDefinition = "nvarchar(50)", nullable = false)
    String province;

    @Column(name = "district", columnDefinition = "nvarchar(50)", nullable = false)
    String district;

    @Column(name = "ward", columnDefinition = "nvarchar(50)", nullable = false)
    String ward;

    @Column(name = "home_number", columnDefinition = "nvarchar(50)", nullable = false)
    String homeNumber;

    @OneToOne(mappedBy = "addressOrder")
    Order order;
}