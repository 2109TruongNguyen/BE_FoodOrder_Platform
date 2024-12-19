package be.be_foodorder_platform.entity;

import be.be_foodorder_platform.entity.enums.Meal;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "personalFood")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonalFood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personalFood_id")
    Integer personalFoodID;

    @Column(name = "personalPlan_id", nullable = false, columnDefinition = "int")
    Integer weekDay;

    @Column(name = "weekIndex", nullable = false, columnDefinition = "int")
    Integer weekIndex;

    @Column(name = "meal", nullable = false, columnDefinition = "nvarchar(50)")
    @Enumerated(EnumType.STRING)
    Meal meal;
}
