package com.zcliu.todoapplication.repository;

import com.zcliu.todoapplication.model.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {

}
