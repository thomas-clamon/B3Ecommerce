package com.example.b3ecommerce.repositories;

import com.example.b3ecommerce.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, String> {

    @Query(value = "select Max(date_commande) FROM Commandes \n" +
            "where email_client = ?1", nativeQuery = true)
    LocalDateTime getLastOrder(String email);
}
