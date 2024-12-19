package be.be_foodorder_platform.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WeekMenu {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "weekMenu_id")
    int weekMenu_id;

    @Column(name = "weekMenuName", columnDefinition = "nvarchar(50)", nullable = false)
    @Size(min = 3, message = "Week menu name must be at least 3 characters.")
    String weekMenuName;

    @Column(name = "startDate", nullable = false)
    LocalDate startDate;

    @Column(name = "endDate", nullable = false)
    LocalDate endDate;
}
