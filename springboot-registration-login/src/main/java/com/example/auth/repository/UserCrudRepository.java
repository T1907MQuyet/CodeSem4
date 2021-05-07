package com.example.auth.repository;

import com.example.auth.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User,Long> {


}
