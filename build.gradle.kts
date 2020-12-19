import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.21"
    id("io.gitlab.arturbosch.detekt") version "1.15.0"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

repositories {
    mavenCentral()
    jcenter()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "15"
    }
}

detekt {
    input = files(
        "src/main/kotlin",
        "src/test/kotlin",
        "build.gradle.kts"
    )
    config = files("src/test/resources/detekt.yml")
}
