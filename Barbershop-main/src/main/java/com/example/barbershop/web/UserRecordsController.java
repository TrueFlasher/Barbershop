package com.example.barbershop.web;

import com.example.barbershop.model.Record;
import com.example.barbershop.repository.RecordRepository;
import com.example.barbershop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashSet;
import java.util.List;

@Controller
public class UserRecordsController {

    private Authentication authentication;

    @Autowired
    RecordRepository recordRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/userRecords")
    public String userRecords(Model model) {

        authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();

        List<Record> list = recordRepository.findAllByUser(userRepository.findByEmail(email));

        model.addAttribute("records", list);

        return "userRecords";
    }
}
