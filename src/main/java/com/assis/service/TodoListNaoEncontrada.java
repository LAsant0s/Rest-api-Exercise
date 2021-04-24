package com.assis.service;

public class TodoListNaoEncontrada extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TodoListNaoEncontrada(Integer id) {
        super("TodoList de id: " + id + " não encontrado");
    }
	
}
