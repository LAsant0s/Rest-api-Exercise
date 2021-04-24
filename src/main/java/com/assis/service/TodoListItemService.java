package com.assis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.assis.domain.TodoList;
import com.assis.domain.TodoListItem;
import com.assis.repository.TodoListItemRepository;

@Service
public class TodoListItemService {

	@Autowired
    TodoListItemRepository itemRepository;
    
	@Autowired
	TodoListService todoListService;
	
	public List<TodoListItem> todosItens() {
	    return itemRepository.findAll();
	}
	
	public TodoListItem novo(TodoListItem item, Integer idList) {
		TodoList list = todoListService.todoList(idList);
		item.setTodoList(list);
	    return itemRepository.save(item);
	}
	
	public TodoListItem todoListItem(Integer id) {
		return itemRepository.findById(id).orElseThrow(() -> new TodoListItemNaoEncontradoException(id));
	}
	
	public TodoListItem atualiza(TodoListItem item, Integer id) {
		item.setId(id);
		return itemRepository.save(item);
	}
	
	public void delete(@PathVariable Integer id) {
		itemRepository.deleteById(id);
	}
	
}
