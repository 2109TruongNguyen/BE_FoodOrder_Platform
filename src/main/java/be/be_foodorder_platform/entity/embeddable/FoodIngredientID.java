package be.be_foodorder_platform.entity.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FoodIngredientID implements Serializable {
    @Column(name = "food_id")
    Integer foodId;

    @Column(name = "ingredient_id")
    Integer ingredientId;
}