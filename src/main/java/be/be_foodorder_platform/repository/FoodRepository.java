package be.be_foodorder_platform.repository;

import be.be_foodorder_platform.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
