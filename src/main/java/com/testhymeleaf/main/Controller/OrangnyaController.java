package com.testhymeleaf.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testhymeleaf.main.Repository.HadirRepo;

@Controller
@RequestMapping("/test")
public class OrangnyaController {

    @Autowired
    private HadirRepo hadirRepo;

    @GetMapping
    public String getAllStudents(Model model) {
        model.addAttribute("hadirList", hadirRepo.findByStatusTrue());
        model.addAttribute("notHadirList", hadirRepo.findByStatusFalse());
        return "all";
    }
}