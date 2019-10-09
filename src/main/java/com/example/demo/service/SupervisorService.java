package com.example.demo.service;


import com.example.demo.model.Supervisor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Service
public class SupervisorService {

    List<Supervisor> supervisors = new ArrayList<>(
            Arrays.asList(
                    new Supervisor("1",
                            "Jean Franco",
                            "Rojas Quiroz",
                            "jean96rq@gmail.com",
                            "123456")

            )
    );

    public List<Supervisor> getAll(){
        return supervisors;
    }
}
