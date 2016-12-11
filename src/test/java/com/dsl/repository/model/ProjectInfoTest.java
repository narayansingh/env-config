package com.dsl.repository.model;

import com.dsl.view.ProjectInfoView;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.hasSize;

/**
 * Created by narayansingh on 11/12/2016.
 */
public class ProjectInfoTest {

    @Test
    public void shouldConvertToView() throws Exception {
        List<ProjectInfo> projectInfos = Arrays.asList(new ProjectInfo());
        List<ProjectInfoView> lists = projectInfos.stream().map(ProjectInfo::initView).collect(Collectors.toList());
        Assert.assertThat(lists, hasSize(1));

    }
}