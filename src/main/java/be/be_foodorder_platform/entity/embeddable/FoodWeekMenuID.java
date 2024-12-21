package be.be_foodorder_platform.entity.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FoodWeekMenuID implements Serializable {
    @Column(name = "food_id")
    Integer foodId;

    @Column(name = "week_menu_id")
    Integer weekMenuId;
}