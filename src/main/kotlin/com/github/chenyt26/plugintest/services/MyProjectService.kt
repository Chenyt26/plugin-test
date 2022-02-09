package com.github.chenyt26.plugintest.services

import com.intellij.openapi.project.Project
import com.github.chenyt26.plugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
