package com.ss9_aop.repository;

import com.ss9_aop.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends JpaRepository<Library,Integer> {
}
