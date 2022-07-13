package com.example.mongo.services.concretes;

import com.example.mongo.core.utilities.results.DataResult;
import com.example.mongo.core.utilities.results.Result;
import com.example.mongo.core.utilities.results.SuccessDataResult;
import com.example.mongo.core.utilities.results.SuccessResult;
import com.example.mongo.models.User;
import com.example.mongo.repository.UserRepository;
import com.example.mongo.services.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserManager implements UserService {
    private final UserRepository userRepository;

    @Override
    public Result add(User user) {
        this.userRepository.insert(user);
        return new SuccessResult("Urun eklendi");
    }

    @Override
    public Result delete(String id) {
        this.userRepository.deleteById(id);
        return new SuccessResult("Urun silindi");
    }

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>(this.userRepository.findAll(),"Urunler getirildi");
    }

    @Override
    public DataResult<User> getUserById(String id) {
        return new SuccessDataResult<User>(this.userRepository.getUserById(id),"urun getirildi");
    }
}
