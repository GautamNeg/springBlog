package com.project.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.blog.util.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
