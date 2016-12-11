package com.dsl.view;

/**
 * Created by narayansingh on 10/12/2016.
 */
public class ProjectInfoView {
    private String projectManager;
    private String solutionArchitect;
    public String name;

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public String getSolutionArchitect() {
        return solutionArchitect;
    }

    public void setSolutionArchitect(String solutionArchitect) {
        this.solutionArchitect = solutionArchitect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
