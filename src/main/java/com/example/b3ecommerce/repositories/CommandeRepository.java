package com.example.b3ecommerce.repositories;

import com.example.b3ecommerce.entities.CommandeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<CommandeEntity, Integer> {
}
