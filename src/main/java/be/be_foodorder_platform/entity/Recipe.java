package be.be_foodorder_platform.entity;

import be.be_foodorder_platform.entity.embeddable.FoodIngredientID;
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
@Table(name = "recipe")
public class Recipe {
    @Column
    Integer quantity;

    @Column(columnDefinition = "nvarchar(50)", name = "measure", nullable = false)
    @Size(min = 3, message = "Measure must be at least 3 characters.")
    String measure;

    @EmbeddedId
    FoodIngredientID foodIngredientID;
    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("foodID")
    @JoinColumn(name = "food_id", referencedColumnName = "food_id")
    Food food;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("ingredientID")
    @JoinColumn(name = "ingredient_id", referencedColumnName = "ingredient_id")
    Ingredient ingredient;
}
