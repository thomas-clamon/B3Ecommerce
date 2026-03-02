package com.example.b3ecommerce.repositories;

import com.example.b3ecommerce.dto.outpout.OPAVGYearDto;
import com.example.b3ecommerce.entities.CommandeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommandeRepository extends JpaRepository<CommandeEntity, Integer> {

    /**
     * Renvoi la moyenne de ventes sur une année données
     * @param year
     * @return
     */
    @Query(value = "select AVG(prix_vente) from Commandes where YEAR(date_commande) = ?1", nativeQuery = true)
    Float AVGSellingByYear (Integer year);

    @Query (value = "select AVG(prix_vente) as 'avg', YEAR(date_commande) as 'year' from Commandes GROUP BY YEAR(date_commande)",
            nativeQuery = true)
    List<OPAVGYearDto> getAVG();

    @Query(value = "select SUM(prix_vente) from Commandes Group By email_client\n" +
            "Having email_client = ?1", nativeQuery = true)
    Float getCAByUser(String email);
}
