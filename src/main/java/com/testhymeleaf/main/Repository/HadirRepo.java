package com.testhymeleaf.main.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.testhymeleaf.main.Model.Absen;

@Repository
public interface HadirRepo extends CrudRepository<Absen, Integer> {
    public List<Absen> findByStatusTrue();

    public List<Absen> findByStatusFalse();
}
