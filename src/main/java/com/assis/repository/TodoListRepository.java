package com.assis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assis.domain.TodoList;

public interface TodoListRepository extends JpaRepository <TodoList, Integer>{

}
