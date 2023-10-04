package com.deliver_meeting.user.controller;

import com.deliver_meeting.user.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @PostMapping("")
    public String signup(UserDto userDto){
        return "redirect:/";
    }
    @GetMapping("")
    public String signupForm(){
        return "user/user";
    }
}
