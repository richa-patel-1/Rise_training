package com.example.springpro.Controller;

import com.example.springpro.Dtos.User;
import com.example.springpro.Service.UserMngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserMgmtController {
    @Autowired
    private UserMngService userManagementService;

    @GetMapping
    public List<User> getAllUsers() {
        return UserMngService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        User user = userManagementService.getUserById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create") // Updated path for create operation
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userManagementService.createUser(user);
        return ResponseEntity.ok(createdUser);
    }

    @PutMapping("/update/{id}") // Updated path for update operation
    public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody User updatedUser) {
        User user = userManagementService.updateUser(id, updatedUser);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
