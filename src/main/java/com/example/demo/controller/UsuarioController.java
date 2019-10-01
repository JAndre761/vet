package com.example.demo.controller;


import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public String getUsuariosList(Model model){
        //list
        List<Usuario> usuarios = usuarioService.getAll();
        model.addAttribute("usuarios", usuarios);
        return "usuarios";
    }

    @PostMapping("/usuarios/save")
    public String saveUsuario(Usuario usuario,
                              Model model){
        //save
        usuarioService.saveUsuario(usuario);

        //list
        List<Usuario> usuarios = usuarioService.getAll();
        model.addAttribute("usuarios",usuarios);
        return "usuario";
    }

    @PostMapping("/usuarios/update/{id}")
    public String updateUsuarios(@PathVariable String id,
                                Usuario usuario,
                                Model model){

        //Update
        usuarioService.updateUsuario(usuario);

        //list
        List<Usuario> usuarios = usuarioService.getAll();
        model.addAttribute("usuarios", usuarios);
        return "usuarios";
    }

    @GetMapping("/usuarios/delete/{id}")
    public String  deleteUsuario(@PathVariable String id,
                                Model model){

        Usuario currentUsuario = usuarioService.findById(id);

        //Delete
        usuarioService.deleteUsuario(currentUsuario);

        //list
        List<Usuario> usuarios = usuarioService.getAll();
        model.addAttribute("usuario", usuarios);
        return "usuario";
    }


}
