package com.nhon.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhon.springmvc.entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}
