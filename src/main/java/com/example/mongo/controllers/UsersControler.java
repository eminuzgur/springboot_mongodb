package com.example.mongo.controllers;

import com.example.mongo.core.utilities.results.DataResult;
import com.example.mongo.core.utilities.results.Result;
import com.example.mongo.models.User;
import com.example.mongo.services.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersControler  {

    private final UserService userService;

    @PostMapping("/add")
    public Result add(@RequestBody User user){
       return this.userService.add(user);
    }

    @GetMapping("/getall")
    public DataResult<List<User>> getAll(){
        return this.userService.getAll();
    }
    @GetMapping("/getById")
    public DataResult<User> getUserById(@RequestParam String id){
        return userService.getUserById(id);
    }

    @DeleteMapping("/deleteById")
    public Result deleteById(@RequestParam String id){
        return this.userService.delete(id);
    }
}
