package be.be_foodorder_platform.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Collection;

@Entity
@Table(name = "food")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_id")
    Integer foodID;

    @Column(name = "foodName", nullable = false, length = 50, columnDefinition = "nvarchar(50)")
    @Size(min = 3, message = "Name must be at least 3 characters.")
    String foodName;

    @Column(name = "foodDescription", nullable = false, columnDefinition = "nvarchar(512)")
    @Size(min = 10, message = "Description must be at least 10 characters.")
    String foodDescription;

    @Size(min = 1, message = "Price must be at least 1.")
    @Column(name = "foodPrice")
    Long foodPrice;

    @Lob
    @Column(name = "foodImageURL")
    Byte[] foodImageURL;

    @Column(name = "foodQuantity")
    Integer foodQuantity;

    @Column(name = "foodOrigin", nullable = false, columnDefinition = "nvarchar(50)")
    @Size(min = 3, message = "Origin must be at least 3 characters.")
    String foodOrigin;

    @Size(min = 10, message = "Recipe must be at least 10 characters.")
    @Column(name = "foodRecipe", nullable = false, columnDefinition = "nvarchar(512)")
    String foodRecipe;

    @Size(min = 1, max = 100, message = "Sale percent must be in range 1 to 100")
    @Column(name = "salePercent", nullable = false)
    Short salePercent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    Category category;

    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Collection<Item> items;

    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Collection<FoodWeekMenu> foodWeekMenus;

    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Collection<PersonalFood> personalFoods;
}
