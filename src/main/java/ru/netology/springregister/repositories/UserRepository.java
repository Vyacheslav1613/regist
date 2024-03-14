package ru.netology.springregister.repositories;

import org.springframework.stereotype.Repository;
import ru.netology.springregister.enum1.Authorities;

import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("admin".equals(user) && "admin".equals(password)) {
            return List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if ("user".equals(user) && "user".equals(password)) {
            return List.of(Authorities.READ);
        } else {
            return List.of();
        }
    }
}