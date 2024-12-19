package be.be_foodorder_platform.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "weekMenu")
public class WeekMenu {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "weekMenu_id")
    Integer weekMenuID;

    @Column(name = "weekMenuName", columnDefinition = "nvarchar(50)", nullable = false)
    @Size(min = 3, message = "Week menu name must be at least 3 characters.")
    String weekMenuName;

    @Column(name = "startDate", nullable = false, columnDefinition = "datetime")
    Date startDate;

    @Column(name = "endDate", nullable = false, columnDefinition = "datetime")
    Date endDate;
}
