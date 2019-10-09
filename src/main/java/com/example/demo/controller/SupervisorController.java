package com.example.demo.controller;

import com.example.demo.model.Supervisor;
import com.example.demo.service.SupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SupervisorController {

    @Autowired
    SupervisorService supervisorService;

    @GetMapping("/supervisors")
    public String getSupervisorList(Model model){
        //list
        List<Supervisor> supervisors = supervisorService.getAll();
        model.addAttribute("supervisors", supervisors);
        return "supervisors";
    }

}
