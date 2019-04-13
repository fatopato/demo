package com.suprema.idenfit.demo.manager;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/managers")
public class ManagerController {

    private ManagerRepository managerRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public ManagerController(ManagerRepository managerRepository, BCryptPasswordEncoder bCryptPasswordEncoder){
        this.managerRepository = managerRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @RequestMapping(value = "sign-up", method = RequestMethod.POST)
    public void signUp(@RequestBody Manager manager){
        manager.setPassword(bCryptPasswordEncoder.encode(manager.getPassword()));
        managerRepository.save(manager);
    }
}
