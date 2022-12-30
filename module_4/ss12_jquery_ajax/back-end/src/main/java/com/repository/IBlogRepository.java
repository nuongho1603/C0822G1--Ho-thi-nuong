package com.repository;

import com.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    @Query(value = "select * from blog where title like %:title%", nativeQuery = true)
    List<Blog> findBlogByTitle(@Param("title") String title);
   // @Query(value = "select * from blog where title like %:title% and category_id = :id", nativeQuery = true)
//    List<Blog> findBlogByTitle(@Param("title") String title,@Param("id") int id);
//    Page<Blog> findByTitleContaining(String title, Pageable pageable);
}
