import aph.pew.Versions
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version Versions.kotlin
    id("io.gitlab.arturbosch.detekt") version Versions.detekt
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    staticAnalysis()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "15"
    }
}

fun DependencyHandlerScope.staticAnalysis() {
    detektPlugins("io.gitlab.arturbosch.detekt", "detekt-formatting", Versions.detekt)
}

detekt {
    input = files(
        "src/main/kotlin",
        "src/test/kotlin",
        "buildSrc/src/main/kotlin",
        "build.gradle.kts"
    )
    config = files("src/test/resources/detekt.yml")
}
