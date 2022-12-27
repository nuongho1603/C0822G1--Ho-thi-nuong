package com.ss9_aop.repository;

import com.ss9_aop.model.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IHistoryRepository extends JpaRepository<History,Integer> {
    @Query(value = "select * from history where book_code = :bookCode ", nativeQuery = true)
    History findByOtp(@Param("bookCode") int bookCode);
}
