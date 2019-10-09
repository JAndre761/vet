package com.example.demo.controller;


import com.example.demo.model.Usuario;
import com.example.demo.model.Veterinaria;
import com.example.demo.service.UsuarioService;
import com.example.demo.service.VeterinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class veterinariaController {

    @Autowired
    VeterinariaService veterinariaService;

    @GetMapping("/veterinarias")
    public String getVeterinariasList(Model model){
        //list
        List<Veterinaria> veterinarias = veterinariaService.getAll();
        model.addAttribute("veterinarias", veterinarias);
        return "veterinarias";
    }


}
