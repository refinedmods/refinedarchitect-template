plugins {
    id("refinedarchitect.fabric")
}

refinedarchitect {
    modId = "refinedarchitecttemplate"
    fabric()
    compileWithProject(project(":refinedarchitect-template-common"))
    publishing {
        // maven = true
        // curseForge = "123"
        // modrinth = "slug"
    }
}

base {
    archivesName.set("refinedarchitect-template-fabric")
}
