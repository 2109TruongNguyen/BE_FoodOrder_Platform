package be.be_foodorder_platform.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Table(name = "personal_week")
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonalWeek {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personal_week_id")
    Integer personalWeekId;

    @Column(name = "week_index", nullable = false, columnDefinition = "int")
    Integer weekIndex;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "personal_plan_id", referencedColumnName = "personal_plan_id")
    PersonalPlan personalPlan;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "week_menu_id", referencedColumnName = "week_menu_id")
    WeekMenu weekMenu;
}