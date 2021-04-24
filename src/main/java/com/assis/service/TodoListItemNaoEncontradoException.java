package com.assis.service;

public class TodoListItemNaoEncontradoException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	TodoListItemNaoEncontradoException(Integer id) {
        super("TodoItemList de id: " + id + " não encontrado");
    }
	
	
}
