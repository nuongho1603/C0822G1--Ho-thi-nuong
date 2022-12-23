package com.repository;

import com.model.MyBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<MyBlog,Integer> {
//
Page<MyBlog> findByTitleContaining(String title, Pageable pageable);

//
//@Query(value = "select *from blog where  name like concat('%', :namee,'%')",nativeQuery = true)
//
//        List<MyBlog> searchName(@Param("namee") String name);
}
