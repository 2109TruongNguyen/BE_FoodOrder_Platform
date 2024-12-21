package be.be_foodorder_platform.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Collection;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "personal_plan")
public class PersonalPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personal_plan_id")
    Integer personalPlanId;

    @Column(name = "weekly_number", nullable = false, columnDefinition = "int")
    Integer weeklyNumber;

    @Column(name = "plan_name", nullable = false, columnDefinition = "nvarchar(50)")
    @Size(min = 1, message = "Plan name must be at least 1 characters.")
    String planName;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    User user;

    @OneToMany(mappedBy = "personalPlan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Collection<PersonalWeek> personalWeeks;
}