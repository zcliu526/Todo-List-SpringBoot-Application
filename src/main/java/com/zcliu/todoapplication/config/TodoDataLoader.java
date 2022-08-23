package com.zcliu.todoapplication.config;

import com.zcliu.todoapplication.model.TodoItem;
import com.zcliu.todoapplication.repository.TodoItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TodoDataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(TodoDataLoader.class);

    @Autowired
    private TodoItemRepository todoRepository;

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData(){

        // if db is empty
        if(todoRepository.count()==0){
            TodoItem todo1 = new TodoItem("Go to church on Sunday");
            TodoItem todo2 = new TodoItem("Run for 30 mins");
            TodoItem todo3 = new TodoItem("Study for exam");

            todoRepository.save(todo1);
            todoRepository.save(todo2);
            todoRepository.save(todo3);

        }
        logger.info("The number of Todo items: {}", todoRepository.count());

    }

    }
