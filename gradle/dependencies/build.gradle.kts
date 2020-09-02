plugins {
    kotlin("jvm")
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
}

sourceSets.main {
    java {
        srcDir(projectDir)
        include("**.kt")
        exclude("**.kts")
    }
}
