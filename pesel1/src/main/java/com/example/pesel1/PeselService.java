package com.example.pesel1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeselService {

    @Autowired
    PeselRepository peselRepository;

    PeselValidator peselValidator = new PeselValidator();


    public void createPerson(String pesel){
        if (peselValidator.validTest(pesel)){
            peselRepository.save(new Pesel(pesel));
        }
    }



}
