package com.demo.Controllers;


import com.demo.Entity.UserStatus;
import com.demo.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {


    @GetMapping("/{userId}")
    public @ResponseBody User getUser(@PathVariable(name = "userId") String userId){
        List<String> phones = new ArrayList<>();
        phones.add("+380995475717");
        phones.add("+380995475718");
        return new User(Long.valueOf(userId), "Test", "User", "genchevskiy.test@gmail.com", "s.g19021992", phones);
    }

    @PostMapping("/register")
    public @ResponseBody
    UserStatus registerUser(@RequestBody User user)  {
        return new UserStatus(user, "success", "User have been registered successfully!");
    }


}
