package com.erich.startdb.repository;

import com.erich.startdb.model.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

//Created by Eric on 4/5/18
// this is used to manage entities
public interface TaskRepository extends PagingAndSortingRepository<Task, Long>{
    List<Task> findAllByOrderByUrgentDesc();
}