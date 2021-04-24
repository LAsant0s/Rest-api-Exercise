package com.assis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.assis.domain.TodoList;
import com.assis.repository.TodoListRepository;

@Service
public class TodoListService {
	
	@Autowired
	TodoListRepository repo; 
	
	public List<TodoList> todos() {
		return repo.findAll(); 
	}
	
	public TodoList novo(TodoList todolist) {
		return repo.save(todolist);
	}
	
	public TodoList todoList(Integer id) {
		return repo.findById(id).orElseThrow(() -> new TodoListNaoEncontrada(id));
	}
	
	public TodoList atualiza(TodoList todo, Integer id) {
		todo.setId(id); 
		return repo.save(todo);
	}
	
	public void deleteTodoList(@PathVariable Integer id) {
		repo.deleteById(id);
	}

}
