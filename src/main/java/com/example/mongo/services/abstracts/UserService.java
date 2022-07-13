package com.example.mongo.services.abstracts;

import com.example.mongo.core.utilities.results.DataResult;
import com.example.mongo.core.utilities.results.Result;
import com.example.mongo.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    Result add(User user);
    Result delete(String id);
    DataResult<List<User>> getAll();
    DataResult<User> getUserById(String id);


}
