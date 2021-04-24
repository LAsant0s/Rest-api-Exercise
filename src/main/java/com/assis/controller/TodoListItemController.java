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

import com.assis.domain.TodoListItem;
import com.assis.service.TodoListItemService;

@RestController
@RequestMapping("/ListItem")
public class TodoListItemController {
	
	  @Autowired
      private TodoListItemService serviceTodoListItem;

      @GetMapping
      public List<TodoListItem> todos() {
              return serviceTodoListItem.todosItens();
      }
      
      @GetMapping("/{id}")
      public TodoListItem todoListItem(@PathVariable Integer id) {
      	return serviceTodoListItem.todoListItem(id);
      }
      
      @PostMapping("/{listId}")
      public TodoListItem novoTodoListItem(@RequestBody TodoListItem item, @PathVariable Integer listId) {
      	TodoListItem novoItem = serviceTodoListItem.novo(item, listId);
      	return novoItem;
      }

      @PutMapping("/{id}")
      public TodoListItem atualizaTodoListItem(@RequestBody TodoListItem item, @PathVariable Integer id) {
              return serviceTodoListItem.atualiza(item, id);
      }

      @DeleteMapping("/{id}")
      void deletaTodoListItem(@PathVariable Integer id) {
      		serviceTodoListItem.delete(id);
      }
	
	
}
