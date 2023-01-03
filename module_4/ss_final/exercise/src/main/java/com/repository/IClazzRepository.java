package com.repository;

import com.model.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClazzRepository extends JpaRepository<Clazz,Integer> {
}
