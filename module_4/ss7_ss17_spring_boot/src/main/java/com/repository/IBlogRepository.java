package com.repository;

import com.model.MyBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<MyBlog,Integer> {

}
