plugins {
    id("refinedarchitect.fabric")
}

refinedarchitect {
    modId = "refinedarchitecttemplate"
    fabric()
    compileWithProject(project(":refinedarchitect-template-platform-common"))
    publishing {
        // maven = true
        // curseForge = "123"
        // modrinth = "slug"
    }
}

base {
    archivesName.set("refinedarchitect-template-platform-fabric")
}
