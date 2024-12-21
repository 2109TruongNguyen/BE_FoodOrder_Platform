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
@Table(name = "food_week_menu")
public class FoodWeekMenu {

    @EmbeddedId
    FoodWeekMenuID foodWeekMenuID;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("foodId")
    @JoinColumn(name = "food_id", referencedColumnName = "food_id")
    Food food;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("weekMenuId")
    @JoinColumn(name = "week_menu_id", referencedColumnName = "week_menu_id")
    WeekMenu weekMenu;
}