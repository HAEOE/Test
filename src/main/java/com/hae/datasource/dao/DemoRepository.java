package com.hae.datasource.dao;

import com.hae.datasource.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DemoRepository extends JpaRepository<Demo, Long> {
//    @Query("select * from demo")
//    List<Demo> findall();
}
