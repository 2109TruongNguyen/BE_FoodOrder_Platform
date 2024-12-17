package be.be_foodorder_platform.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;
import jakarta.persistence.GenerationType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ingredientID;

    @Column(name = "ingredientName", nullable = false, columnDefinition = "nvarchar(50)")
    @Size(min = 1, message = "Ingredient name must be at least 1 characters.")
    String ingredientName;

    @Column(name = "ingredientPrice", nullable = false)
    double ingredientPrice;

    @Column(name = "ingredientMeasure", nullable = false, columnDefinition = "nvarchar(50)")
    @Size(min = 1, message = "Ingredient measure must be at least 1 characters.")
    String ingredientMeasure;

    @Column(name = "status", nullable = false)
    boolean isEnable;
}
