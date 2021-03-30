package com.example.springbootcrudloginuploadfile.repository;

import com.example.springbootcrudloginuploadfile.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,String> {


}
