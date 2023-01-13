package com.pp231;

import com.pp231.config.DataBaseConfig;
import com.pp231.model.User;
import com.pp231.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DataBaseConfig.class);

        UserService userService = context.getBean(UserService.class);
//        List<User> users = Arrays.asList(
//                new User("User1", "Lastname1", "user1@mail.ru"),
//                new User("User2", "Lastname2", "user2@mail.ru"),
//                new User("User3", "Lastname3", "user3@mail.ru"),
//                new User("User4", "Lastname4", "user4@mail.ru"));
//        users.stream().forEach(userService::saveUser);
//        userService.saveUser(new User("test0","test00","test0@test00.test"));
//        userService.deleteUser(6);
//        userService.saveUser(new User("test1","test11","test1@test11.test"));
//        User user = new User("test1","test11","test1@test11.test");
//        user.setId(13);
//        user.setName("UpdateName");
//        userService.updateUser(user);


    }
}
