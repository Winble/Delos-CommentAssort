package com.ctrip.delos.repository;

import com.ctrip.delos.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
    Blog findByUserName(String userName);
}
