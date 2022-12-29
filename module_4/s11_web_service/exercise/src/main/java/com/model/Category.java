package com.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    @JsonBackReference
    public Set<Blog> blogList;

    public Category() {
    }

    public Category(int id, String name, Set<Blog> blogList) {
        this.id = id;
        this.name = name;
        this.blogList = blogList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(Set<Blog> blogList) {
        this.blogList = blogList;
    }
}
