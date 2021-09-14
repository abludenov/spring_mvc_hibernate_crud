//package ru.jm.spring_mvc_hibernate.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import ru.jm.spring_mvc_hibernate.entity.User;
//import ru.jm.spring_mvc_hibernate.service.UserService;
//
//import java.util.List;
//
//@Controller
//public class UserControllerV1 {
//
//    private final UserService userService;
//
//    @Autowired
//    public UserControllerV1(UserService userService) {
//        this.userService = userService;
//    }
//
//    @RequestMapping("/")
//    public String showAllUsers(Model model) {
//        List<User> allUsers = userService.getAllUsers();
//        model.addAttribute("allUsers", allUsers);
//        return "all-users";
//    }
//
//    @RequestMapping("/addNewUser")
//    public String addNewUser(Model model) {
//        model.addAttribute("user", new User());
//        return "user-info";
//    }
//
//    @RequestMapping("/saveUser")
//    public String saveUser(@ModelAttribute("user") User user) {
//        userService.saveUser(user);
//        return "redirect:/";
//    }
//
//    @RequestMapping("/updateUser")
//    public String updateUser(@RequestParam("id") Integer id, Model model) {
//        User user = userService.getUser(id);
//        model.addAttribute(user);
//        return "user-info";
//    }
//
//    @RequestMapping("/deleteUser")
//    public String deleteUser(@RequestParam("id") Integer id) {
//        userService.deleteUser(id);
//        return "redirect:/";
//    }
//}
