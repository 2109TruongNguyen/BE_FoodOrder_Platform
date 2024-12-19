package be.be_foodorder_platform.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ingredient_id")
    Integer ingredient_id;

    @Column(name = "ingredientName", nullable = false, columnDefinition = "nvarchar(50)")
    @Size(min = 1, message = "Ingredient name must be at least 1 characters.")
    String ingredientName;

    @Column(name = "ingredientPrice", nullable = false)
    double ingredientPrice;

    @Column(name = "ingredientMeasure", nullable = false, columnDefinition = "nvarchar(50)")
    @Size(min = 1, message = "Ingredient measure must be at least 1 characters.")
    String ingredientMeasure;

    @Column(name = "status", nullable = false)
    Boolean isEnable;
}
