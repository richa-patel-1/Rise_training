package com.demo.Shawn.Service;
import java.util.ArrayList;
import java.util.List;
import com.demo.Shawn.Dtos.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserManagementService {
    private List<UserDto> users = new ArrayList<>();

    {
        users.add(new UserDto("1", "john_doe", "john.doe@example.com"));
        users.add(new UserDto("2", "jane_smith", "jane.smith@example.com"));
    }
    public List<UserDto> getAllUsers() {
        return users;
    }

    public UserDto getUserById(String id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public UserDto createUser(UserDto user) {
        user.setId(String.valueOf(users.size() + 1));
        users.add(user);
        return user;
    }

    public UserDto updateUser(String id, UserDto updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            UserDto user = users.get(i);
            if (user.getId().equals(id)) {
                updatedUser.setId(id);
                users.set(i, updatedUser);
                return updatedUser;
            }
        }
        return null;
    }
}
