plugins {
    id("com.refinedmods.refinedarchitect.root")
    id("com.refinedmods.refinedarchitect.base")
}

refinedarchitect {
    // sonarQube("refinedmods_XXX", "refinedmods")
}

subprojects {
    group = "com.refinedmods.refinedarchitect-template"
}
