package be.be_foodorder_platform.entity;

import be.be_foodorder_platform.entity.enums.TransactionType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transactions")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    Long transactionId;

    @Column(nullable = false, name = "trans_date")
    Date transDate;

    @Column(nullable = false, name = "amount")
    Long amount;

    @Column(nullable = false, name = "is_done")
    Boolean isDone;

    @Column(nullable = false, unique = true, name = "transaction_no")
    String transactionNo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "type")
    TransactionType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    User user;
}