plugins {
    kotlin("jvm") version "2.0.0"
    application
}

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

application {
    mainClass = "aph.pew.kotlin.cli.MainKt"
}

repositories {
    mavenCentral()
}
