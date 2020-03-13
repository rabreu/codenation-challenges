package com.challenge.endpoints;

import com.challenge.entity.User;
import com.challenge.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public Optional<User> findById(@PathVariable(value = "userId") Long userId) {
        return userService.findById(userId);
    }

    @GetMapping(params = "accelerationName")
    public List<User> findByAccelerationName(@RequestParam String accelerationName) {
        return userService.findByAccelerationName(accelerationName);
    }

    @GetMapping(params = "companyId")
    public List<User> findByCompanyId(@RequestParam Long companyId) {
        return userService.findByCompanyId(companyId);
    }
}
