plugins {
    id("com.refinedmods.refinedarchitect.common")
}

refinedarchitect {
    common()
    publishing {
        // maven = true
    }
}

base {
    archivesName.set("refinedarchitect-template-common")
}
