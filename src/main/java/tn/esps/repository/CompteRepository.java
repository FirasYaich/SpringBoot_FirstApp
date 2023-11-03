package tn.esps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esps.entity.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Integer> {

}
