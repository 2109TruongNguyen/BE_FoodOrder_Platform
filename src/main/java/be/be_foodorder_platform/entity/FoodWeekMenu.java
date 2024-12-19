package be.be_foodorder_platform.entity;

import be.be_foodorder_platform.entity.embeddableID.FoodWeekMenuID;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "food_weekMenu")
public class FoodWeekMenu {

    @EmbeddedId
    FoodWeekMenuID foodWeekMenuID;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("foodID")
    Food foods;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("weekMenuID")
    WeekMenu weekMenus;
}
