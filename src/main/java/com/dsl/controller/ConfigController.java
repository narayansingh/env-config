package com.dsl.controller;

import com.dsl.model.ProjectInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by narayansingh on 10/12/2016.
 */
@Controller
public class ConfigController {

    @GetMapping("/project-info")
    public String projectInfoForm(Model model) {
        model.addAttribute("project", new ProjectInfo());
        return "project-info";
    }

    @PostMapping("/project-info")
    public String projectInfoSubmission(@ModelAttribute ProjectInfo project, Model model) {
        model.addAttribute("project", project);
        return "project-info-conf";
    }
}
