package com.demo.vivek.Service;
import com.demo.vivek.Dtos.Userdatatransferobject;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    private static List<Userdatatransferobject> users = new ArrayList<>();

    {
        users.add(new Userdatatransferobject("1", "Vivek Chauhan", "vivek123@gmail.com"));
        users.add(new Userdatatransferobject("2", "shyam_joshi", "shyam123@example.com"));
    }
    public static List<Userdatatransferobject> getAllUsers() {
        return users;
    }

    public Userdatatransferobject getUserById(String id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public Userdatatransferobject createUser(Userdatatransferobject user) {
        user.setId(String.valueOf(users.size() + 1));
        users.add(user);
        return user;
    }

    public Userdatatransferobject updateUser(String id, Userdatatransferobject updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            Userdatatransferobject user = users.get(i);
            if (user.getId().equals(id)) {
                updatedUser.setId(id);
                users.set(i, updatedUser);
                return updatedUser;
            }
        }
        return null;
    }
}
