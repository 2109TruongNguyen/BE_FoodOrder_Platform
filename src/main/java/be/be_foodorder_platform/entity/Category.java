package be.be_foodorder_platform.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Collection;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    Integer categoryID;

    @Column(name = "categoryName", nullable = false, columnDefinition = "nvarchar(50)")
    @Size(min = 3, message = "Category name must be at least 3 characters.")
    String categoryName;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    Collection<Food> food;
}
