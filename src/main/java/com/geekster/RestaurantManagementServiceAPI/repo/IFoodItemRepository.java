package com.geekster.RestaurantManagementServiceAPI.repo;

import com.geekster.RestaurantManagementServiceAPI.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodItemRepository extends JpaRepository<FoodItem, Integer> {
}
