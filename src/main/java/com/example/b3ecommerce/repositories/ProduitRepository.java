package com.example.b3ecommerce.repositories;

import com.example.b3ecommerce.entities.ProduitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<ProduitEntity, Integer> {
}
