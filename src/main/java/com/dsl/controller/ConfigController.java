package com.dsl.controller;

import com.dsl.repository.ProjectInfoRepository;
import com.dsl.repository.model.ProjectInfo;
import com.dsl.view.ProjectInfoView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.stream.StreamSupport;

import static java.util.stream.Collectors.toList;

/**
 * Created by narayansingh on 10/12/2016.
 */
@Controller
public class ConfigController {
    @Autowired private ProjectInfoRepository projectInfoRepository;

    @GetMapping("/project-info/new")
    public String projectInfoNew(Model model) {
        model.addAttribute("project", new ProjectInfoView());
        return "project-info";
    }

    @PostMapping("/project-info")
    @Transactional
    public String projectInfoSubmission(@ModelAttribute ProjectInfoView project, Model model) {
        projectInfoRepository.save(ProjectInfo.fromView(project));
        return "redirect:/project-info/all";
    }

    @GetMapping("/project-info/all")
    public String projectInfoAll(Model model) {
        Iterable<ProjectInfo> all = projectInfoRepository.findAll();
        List<ProjectInfoView> projects = StreamSupport.stream(all.spliterator(), false)
                .map(ProjectInfo::initView)
                .collect(toList());

        model.addAttribute("projects", projects);
        return "project-info-all";
    }
}
