package be.be_foodorder_platform.entity.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonalId implements Serializable {
    @Column(name = "food_id")
    Integer foodId;

    @Column(name = "personal_plan_id")
    Integer personalPlanId;
}