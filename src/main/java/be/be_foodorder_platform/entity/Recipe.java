package be.be_foodorder_platform.entity;

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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    Integer recipeID;

    @Column
    Integer quantity;

    @Column(columnDefinition = "nvarchar(50)", name = "measure", nullable = false)
    @Size(min = 3, message = "Measure must be at least 3 characters.")
    String measure;
}
