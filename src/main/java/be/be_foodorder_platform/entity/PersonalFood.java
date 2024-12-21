package be.be_foodorder_platform.entity;

import be.be_foodorder_platform.entity.embeddable.PersonalId;
import be.be_foodorder_platform.entity.enums.Meal;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "personal_food")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonalFood {
    @EmbeddedId
    PersonalId personalFoodId;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("foodId")
    @JoinColumn(name = "food_id", referencedColumnName = "food_id")
    Food food;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("personalPlanId")
    @JoinColumn(name = "personal_plan_id", referencedColumnName = "personal_plan_id")
    PersonalPlan personalPlan;

    @Column(name = "week_day", nullable = false, columnDefinition = "int")
    Integer weekDay;

    @Column(name = "week_index", nullable = false, columnDefinition = "int")
    Integer weekIndex;

    @Column(name = "meal", nullable = false, columnDefinition = "nvarchar(50)")
    @Enumerated(EnumType.STRING)
    Meal meal;
}