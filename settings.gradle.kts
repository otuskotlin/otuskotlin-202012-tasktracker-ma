rootProject.name = "tasktkr"

pluginManagement {
    val kotlinVersion: String by settings

    plugins {
        kotlin("multiplatform") version kotlinVersion
        kotlin("jvm") version kotlinVersion
        kotlin("js") version kotlinVersion
    }
}

include("tasktkr-common-be")
include("tasktkr-common-mp")
