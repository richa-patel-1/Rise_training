package com.demo.Shawn.Controller;
import java.util.List;

import com.demo.Shawn.Dtos.UserDto;
import com.demo.Shawn.Service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserMgntController {
    @Autowired
    private UserManagementService userManagementService;

    @GetMapping
    public List<UserDto> getAllUsers() {
        return userManagementService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable String id) {
        UserDto user = userManagementService.getUserById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create") // Updated path for create operation
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user) {
        UserDto createdUser = userManagementService.createUser(user);
        return ResponseEntity.ok(createdUser);
    }

    @PutMapping("/update/{id}") // Updated path for update operation
    public ResponseEntity<UserDto> updateUser(@PathVariable String id, @RequestBody UserDto updatedUser) {
        UserDto user = userManagementService.updateUser(id, updatedUser);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
