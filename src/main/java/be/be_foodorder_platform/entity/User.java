package be.be_foodorder_platform.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import jakarta.validation.constraints.Size;

import java.util.Collection;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    Long userId;

    @Column(name = "user_name", nullable = false, unique = true)
    @Size(min = 3, message = "Username must be at least 3 characters.")
    String username;

    @Size(min = 8, message = "Password must be at least 8 characters.")
    @Column(name = "password", nullable = false, columnDefinition = "nvarchar(50)")
    String password;

    @Column(name = "email", columnDefinition = "nvarchar(50)", unique = true, nullable = false)
    String email;

    @Size(min = 10, message = "Phone number must be at least 10 characters.")
    @Column(name = "phone", nullable = false, columnDefinition = "varchar(15)", unique = true)
    String phone;

    @Column(name = "full_name", columnDefinition = "nvarchar(512)", nullable = false)
    @Size(min = 7, message = "Full name must be at least 7 characters.")
    String fullName;

    @Lob
    @Column(name = "avatar")
    Byte[] avatar;

    @Column(name = "status", nullable = false)
    Boolean isEnable;

    @Column(name = "balance", nullable = false)
    Long balance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    AddressAccount addressAccount;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Collection<Order> orders;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Collection<PersonalPlan> personalPlans;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Collection<Transaction> transactions;
}