package com.assis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assis.domain.TodoList;
import com.assis.service.TodoListService;

@RestController
@RequestMapping("/TodoList")
public class TodoListController {

	@Autowired
	private TodoListService service; 
	
	@GetMapping
	public List<TodoList> todos() {
		return service.todos();
	}
	
	@PostMapping
	public TodoList novoTodoList(@RequestBody TodoList todo) {
		return service.novo(todo);
	}
	
	@GetMapping("/{id}")
	public TodoList todoList(@PathVariable Integer id) {
		return service.todoList(id);
	}
	
	@PutMapping("/{id}")
    public TodoList atualizaTodoList(@RequestBody TodoList todo, @PathVariable Integer id) {
		return service.atualiza(todo, id);
    }
	
	 @DeleteMapping("/{id}")
     void deletaTodoList(@PathVariable Integer id) {
             service.deleteTodoList(id);
     }
	
}
