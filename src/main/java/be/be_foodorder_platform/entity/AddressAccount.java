package be.be_foodorder_platform.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "addressAccount")
public class AddressAccount {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    Long address_id;

    @Column(name = "province", columnDefinition = "nvarchar(50)", nullable = false)
    @Size(min = 3, message = "Province must be at least 3 characters.")
    String province;

    @Column(name = "district", columnDefinition = "nvarchar(50)", nullable = false)
    @Size(min = 3, message = "District must be at least 3 characters.")
    String district;

    @Column(name = "ward", columnDefinition = "nvarchar(50)", nullable = false)
    @Size(min = 3, message = "Ward must be at least 3 characters.")
    String ward;

    @Column(name = "homeNumber", columnDefinition = "nvarchar(50)", nullable = false)
    @Size(min = 3, message = "Home number must be at least 3 characters.")
    String homeNumber;
}
