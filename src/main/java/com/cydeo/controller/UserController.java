package com.cydeo.controller;

import com.cydeo.dto.UserDTO;
import com.cydeo.entity.User;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private final RoleService roleService;

    public UserController( RoleService rolService) {
        this.roleService = rolService;

    }

    @GetMapping("/create")
    public String createUser(Model model){

        model.addAttribute("user", new User());
        model.addAttribute("roles", roleService.findAll());

        return "/user/create";
    }

}
