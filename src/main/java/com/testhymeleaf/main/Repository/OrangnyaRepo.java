package com.testhymeleaf.main.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testhymeleaf.main.Model.Absen;

@Repository
public interface OrangnyaRepo extends CrudRepository<Absen, Integer> {

}