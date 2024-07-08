plugins {
    id("refinedarchitect.neoforge")
}

refinedarchitect {
    modId = "refinedarchitecttemplate"
    neoForge()
    compileWithProject(project(":refinedarchitect-template-platform-common"))
    publishing {
        // maven = true
        // curseForge = "123"
        // modrinth = "slug"
    }
}

base {
    archivesName.set("refinedarchitect-template-platform-neoforge")
}
