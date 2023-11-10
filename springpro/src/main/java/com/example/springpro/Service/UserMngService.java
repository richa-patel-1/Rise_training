

package com.example.springpro.Service;

import com.example.springpro.Dtos.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserMngService {
    private static List<User> users = new ArrayList<>();

    {
        users.add(new User("1", "Raju Rashtogi", "raju.rastogi@yahoo.com"));
        users.add(new User("2", "Varun Sharma", "varun.Sharma@Gmail.com"));
        users.add(new User("3", "Abhishek Tiwari", "abhishke.t.@Gmail.com"));
    }
    public static List<User> getAllUsers() {
        return users;
    }

    public User getUserById(String id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public User createUser(User user) {
        user.setId(String.valueOf(users.size() + 1));
        users.add(user);
        return user;
    }

    public User updateUser(String id, User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getId().equals(id)) {
                updatedUser.setId(id);
                users.set(i, updatedUser);
                return updatedUser;
            }
        }
        return null;
    }
}