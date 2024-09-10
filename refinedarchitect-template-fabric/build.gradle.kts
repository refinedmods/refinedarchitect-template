plugins {
    id("refinedarchitect.fabric")
}

refinedarchitect {
    modId = "refinedarchitecttemplate"
    fabric()
    publishing {
        // maven = true
        // curseForge = "123"
        // modrinth = "slug"
    }
}

base {
    archivesName.set("refinedarchitect-template-fabric")
}

val commonJava by configurations.existing
val commonResources by configurations.existing

dependencies {
    compileOnly(project(":refinedarchitect-template-common"))
    commonJava(project(path = ":refinedarchitect-template-common", configuration = "commonJava"))
    commonResources(project(path = ":refinedarchitect-template-common", configuration = "commonResources"))
}
