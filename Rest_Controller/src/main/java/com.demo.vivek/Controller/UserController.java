package com.demo.vivek.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.demo.vivek.Dtos.Userdatatransferobject;
import com.demo.vivek.Service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userManagementService;

    @GetMapping
    public List<Userdatatransferobject> getAllUsers() {
        return UserService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Userdatatransferobject> getUserById(@PathVariable String id) {
        Userdatatransferobject user = userManagementService.getUserById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create") // Updated path for create operation
    public ResponseEntity<Userdatatransferobject> createUser(@RequestBody Userdatatransferobject user) {
        Userdatatransferobject createdUser = userManagementService.createUser(user);
        return ResponseEntity.ok(createdUser);
    }

    @PutMapping("/update/{id}") // Updated path for update operation
    public ResponseEntity<Userdatatransferobject> updateUser(@PathVariable String id, @RequestBody Userdatatransferobject updatedUser) {
        Userdatatransferobject user = userManagementService.updateUser(id, updatedUser);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
