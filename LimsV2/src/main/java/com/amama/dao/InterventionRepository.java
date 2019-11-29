package com.amama.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.amama.domain.Intervention;

@Repository
public interface InterventionRepository extends CrudRepository<Intervention, Long>{

}
