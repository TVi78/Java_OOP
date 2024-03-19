package Homework5.src.model.repository;

import java.util.List;
import java.util.Optional;

import Homework5.src.model.User;

public interface GBRepository {
    List<User> findAll();
    User create(User user);
    Optional<User> findById(Long id);
    Optional<User> update(Long userId, User update);
    boolean delete(Long id);
    List<String> readAll();
    void saveAll(List<String> data);
}
