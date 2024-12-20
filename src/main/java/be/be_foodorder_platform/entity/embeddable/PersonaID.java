package be.be_foodorder_platform.entity.embeddable;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonaID {
    @Column(name = "food_id")
    Integer foodID;

    @Column(name = "personalPlan_id")
    Integer peronsalPlanID;
}
