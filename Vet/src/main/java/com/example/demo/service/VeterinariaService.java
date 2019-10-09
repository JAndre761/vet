package com.example.demo.service;


import com.example.demo.model.Usuario;
import com.example.demo.model.Veterinaria;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class VeterinariaService {

    List<Veterinaria> veterinarias = new ArrayList<>(
            Arrays.asList(
                    new Veterinaria("1",
                            "Veteri1",
                            "Surco",
                            "jean96rq@gmail.com",
                            "9919205154")

            )
    );


    public List<Veterinaria> getAll(){
        return veterinarias;
    }
}
