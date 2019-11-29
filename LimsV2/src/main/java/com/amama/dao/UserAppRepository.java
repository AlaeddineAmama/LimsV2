package com.amama.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amama.domain.UserApp;

@Repository
public interface UserAppRepository extends CrudRepository<UserApp, Long>{

}
