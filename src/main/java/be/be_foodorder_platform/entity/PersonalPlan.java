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
public class PersonalPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personalPlan_id")
    int personalPlan_id;

    @Column(name = "weeklyNumber", nullable = false, columnDefinition = "int")
    int weeklyNumber;

    @Column(name = "planName", nullable = false, columnDefinition = "nvarchar(50)")
    @Size(min = 1, message = "Plan name must be at least 1 characters.")
    String planName;
}