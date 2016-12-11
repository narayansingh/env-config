package com.dsl.repository.model;

import com.dsl.view.ProjectInfoView;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

/**
 * Created by narayansingh on 10/12/2016.
 */
@Entity
@Table(name = "project_info")
public class ProjectInfo {
    @Id
    @Column(name = "ID")
    public String id;

    @NotNull
    @Column(name = "NAME")
    public String name;

    @Column(name = "PROJECT_MANAGER")
    public String projectManager;

    @Column(name = "SOLUTION_ARCHITECT")
    public String solutionArchitect;

    @Column(name = "CREATED_DATE")
    public Date createdDate = new Date();

    @Column(name = "UPDATED_DATE")
    public Date updatedDate = new Date();

    public static ProjectInfo fromView(ProjectInfoView view) {
        ProjectInfo projectInfo = new ProjectInfo();
        projectInfo.id = UUID.randomUUID().toString();
        projectInfo.name = view.name;
        projectInfo.projectManager = view.getProjectManager();
        projectInfo.solutionArchitect = view.getSolutionArchitect();
        return projectInfo;
    }

    public ProjectInfoView initView() {
        ProjectInfoView view = new ProjectInfoView();
        view.setName(this.name);
        view.setProjectManager(this.projectManager);
        view.setSolutionArchitect(this.solutionArchitect);
        return view;
    }
}
