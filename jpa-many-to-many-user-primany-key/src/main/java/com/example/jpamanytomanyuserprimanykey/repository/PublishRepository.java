package com.example.jpamanytomanyuserprimanykey.repository;

import com.example.jpamanytomanyuserprimanykey.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublishRepository extends JpaRepository<Publisher,Integer> {
}
