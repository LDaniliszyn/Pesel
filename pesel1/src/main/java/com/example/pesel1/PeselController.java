package com.example.pesel1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeselController {

    @Autowired
    PeselService peselService;

    @PostMapping("/")
    public String addPesel(@RequestBody String pesel){
        peselService.createPerson(pesel);
        return peselService.peselRepository.toString();
    }

}
