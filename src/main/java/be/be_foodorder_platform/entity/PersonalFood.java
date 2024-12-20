package be.be_foodorder_platform.entity;

import be.be_foodorder_platform.entity.embeddable.PersonaID;
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
    @EmbeddedId
    PersonaID personalFoodID;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("foodID")
    @JoinColumn(name = "food_id", referencedColumnName = "food_id")
    Food food;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("personalPlanID")
    @JoinColumn(name = "personalPlan_id", referencedColumnName = "personalPlan_id")
    PersonalPlan personalPlan;

    @Column(name = "weekDay", nullable = false, columnDefinition = "int")
    Integer weekDay;

    @Column(name = "weekIndex", nullable = false, columnDefinition = "int")
    Integer weekIndex;

    @Column(name = "meal", nullable = false, columnDefinition = "nvarchar(50)")
    @Enumerated(EnumType.STRING)
    Meal meal;
}
