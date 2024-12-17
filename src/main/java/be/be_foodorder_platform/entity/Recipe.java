package be.be_foodorder_platform.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int recipeID;

    @Column
    int quantity;

    @Column(columnDefinition = "nvarchar(50)", name = "measure", nullable = false)
    @Size(min = 3, message = "Measure must be at least 3 characters.")
    String measure;
}
