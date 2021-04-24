package com.assis.domain;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class TodoListItem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JsonBackReference
	private TodoList todoList;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeDoItem; 
	
	public TodoListItem(String nomeDoItem) {
		this.nomeDoItem = nomeDoItem;
	} 
	
	public TodoListItem() {
		
	}

	public String getNomeDoItem() {
		return nomeDoItem;
	}

	public void setNomeDoItem(String nomeDoItem) {
		this.nomeDoItem = nomeDoItem;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TodoList getTodoList() {
		return todoList;
	}

	public void setTodoList(TodoList todoList) {
		this.todoList = todoList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TodoListItem other = (TodoListItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}