package be.be_foodorder_platform.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Table(name = "personalWeek")
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonalWeek {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personalWeek_id")
    Integer personalWeekID;

    @Column(name = "weekIndex", nullable = false, columnDefinition = "int")
    Integer weekIndex;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "personalPlan_id", referencedColumnName = "personalPlan_id")
    PersonalPlan personalPlan;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "weekMenu_id", referencedColumnName = "weekMenu_id")
    WeekMenu weekMenu;
}
