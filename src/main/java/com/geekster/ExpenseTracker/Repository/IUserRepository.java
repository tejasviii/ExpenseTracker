package com.geekster.ExpenseTracker.Repository;

import com.geekster.ExpenseTracker.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRepository extends JpaRepository<User, Integer> {
    List<User> findAllByUserName(String userName);
}
