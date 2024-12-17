package com.TradingApp.TradingProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TradingApp.TradingProject.Model.User;

public interface UserRepository extends JpaRepository<User, Long>{

    
     
}
