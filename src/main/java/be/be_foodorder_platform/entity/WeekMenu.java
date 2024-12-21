package be.be_foodorder_platform.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "week_menu")
public class WeekMenu {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "week_menu_id")
    Integer weekMenuId;

    @Column(name = "week_menu_name", columnDefinition = "nvarchar(50)", nullable = false)
    @Size(min = 3, message = "Week menu name must be at least 3 characters.")
    String weekMenuName;

    @Column(name = "start_date", nullable = false, columnDefinition = "datetime")
    Date startDate;

    @Column(name = "end_date", nullable = false, columnDefinition = "datetime")
    Date endDate;

    @OneToMany(mappedBy = "weekMenu", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Collection<PersonalWeek> personalWeeks;

    @OneToMany(mappedBy = "weekMenu", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Collection<FoodWeekMenu> foodWeekMenus;
}