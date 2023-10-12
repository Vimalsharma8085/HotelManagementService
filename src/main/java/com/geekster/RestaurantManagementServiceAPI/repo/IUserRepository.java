package com.geekster.RestaurantManagementServiceAPI.repo;

import com.geekster.RestaurantManagementServiceAPI.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {

    User findFirstByEmail(String email);

    User findFirstByPassword(String pass);
}
