package be.be_foodorder_platform.entity;

import be.be_foodorder_platform.entity.embeddable.FoodWeekMenuID;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "foodWeekMenu")
public class FoodWeekMenu {
    @EmbeddedId
    FoodWeekMenuID foodWeekMenuID;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("foodID")
    @JoinColumn(name = "food_id", referencedColumnName = "food_id")
    Food food;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("weekMenuID")
    @JoinColumn(name = "weekMenu_id", referencedColumnName = "weekMenu_id")
    WeekMenu weekMenu;
}
