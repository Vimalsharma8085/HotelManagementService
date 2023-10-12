package com.geekster.RestaurantManagementServiceAPI.model;

import com.geekster.RestaurantManagementServiceAPI.model.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class UserAuthToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String value;
    private LocalDateTime creationInstant;
    @OneToOne
    @JoinColumn(name = "fkUserId")
    private User user;

    public UserAuthToken(User user){
        this.user=user;
        creationInstant=LocalDateTime.now();
        value= UUID.randomUUID().toString();
    }
}
