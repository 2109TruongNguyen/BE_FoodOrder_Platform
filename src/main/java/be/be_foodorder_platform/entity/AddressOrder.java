package be.be_foodorder_platform.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Table(name = "addressOrder")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level =  AccessLevel.PRIVATE)
public class AddressOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addressOrder_id")
    Integer addressOrderID;

    @Column(name = "province", columnDefinition = "nvarchar(50)", nullable = false)
    String province;

    @Column(name = "district", columnDefinition = "nvarchar(50)", nullable = false)
    String district;

    @Column(name = "ward", columnDefinition = "nvarchar(50)", nullable = false)
    String ward;

    @Column(name = "homeNumber", columnDefinition = "nvarchar(50)", nullable = false)
    String homeNumber;

    @OneToOne(mappedBy = "addressOrder")
    Order order;
}
