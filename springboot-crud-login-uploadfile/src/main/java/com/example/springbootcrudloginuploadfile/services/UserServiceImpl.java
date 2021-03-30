package com.example.springbootcrudloginuploadfile.services;

import com.example.springbootcrudloginuploadfile.model.User;
import com.example.springbootcrudloginuploadfile.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User entity) {
        return userRepository.save(entity);
    }

    @Override
    public List<User> saveAll(List<User> entities) {
        return (List<User>) userRepository.saveAll(entities);
    }

    @Override
    public Optional<User> findById(String s) {
        return userRepository.findById(s);
    }

    @Override
    public boolean existsById(String s) {
        return userRepository.existsById(s);
    }

    @Override
    public List<User> findAll() {
        return (List<User>)userRepository.findAll();
    }

    @Override
    public List<User> findAllById(List<String> ids) {
        return (List<User>)userRepository.findAllById(ids);
    }

    @Override
    public long count() {
        return userRepository.count();
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public void deleteAll(List<User> entities) {
        userRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }
}
