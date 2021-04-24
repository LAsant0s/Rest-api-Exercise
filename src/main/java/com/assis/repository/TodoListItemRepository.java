package com.assis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assis.domain.TodoListItem;

public interface TodoListItemRepository extends JpaRepository <TodoListItem, Integer>{

}
