package be.be_foodorder_platform.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    Integer itemID;

    @Column(name = "itemQuantity")
    Integer itemQuantity;

    @Column(name = "totalPrice")
    Double totalPrice;
}
