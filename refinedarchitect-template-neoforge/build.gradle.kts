plugins {
    id("com.refinedmods.refinedarchitect.neoforge")
}

refinedarchitect {
    modId = "refinedarchitecttemplate"
    neoForge()
    publishing {
        // maven = true
        // curseForge = "project id"
        // modrinth = "project id"
    }
}

base {
    archivesName.set("refinedarchitect-template-neoforge")
}

val commonJava by configurations.existing
val commonResources by configurations.existing

dependencies {
    compileOnly(project(":refinedarchitect-template-common"))
    commonJava(project(path = ":refinedarchitect-template-common", configuration = "commonJava"))
    commonResources(project(path = ":refinedarchitect-template-common", configuration = "commonResources"))
}
