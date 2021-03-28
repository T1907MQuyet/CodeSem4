package com.example.crudspingboot1.model;

import com.example.crudspingboot1.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,Long> {
}
