package com.geekster.RestaurantManagementServiceAPI.repo;

import com.geekster.RestaurantManagementServiceAPI.model.order.FoodOrder;
import com.geekster.RestaurantManagementServiceAPI.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IOrderRepository extends JpaRepository<FoodOrder, Integer> {
    List<FoodOrder> findByUser(User user);
}
