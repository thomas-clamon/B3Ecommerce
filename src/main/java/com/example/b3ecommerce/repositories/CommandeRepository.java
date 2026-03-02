package com.example.b3ecommerce.repositories;

import com.example.b3ecommerce.entities.CommandeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<CommandeEntity, Integer> {

    /**
     * Renvoi la moyenne de ventes sur une année données
     * @param year
     * @return
     */
    @Query(value = "select AVG(prix_vente) from Commandes where YEAR(date_commande) = ?1", nativeQuery = true)
    Float AVGSellingByYear (Integer year);
}
