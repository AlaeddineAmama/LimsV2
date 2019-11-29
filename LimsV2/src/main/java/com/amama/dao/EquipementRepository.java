package com.amama.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amama.domain.Equipement;

@Repository
public interface EquipementRepository extends CrudRepository<Equipement, Long> {

}
