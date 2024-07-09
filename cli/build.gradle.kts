plugins {
    alias(libs.plugins.aph.kotlin)
    application
}

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

application {
    mainClass = "io.github.aaron_harris.pew.kotlin.cli.MainKt"
}

aphKotlin {
    codeCoverage.excludedClasses.add(application.mainClass)
}

dependencies {
    testImplementation(libs.bundles.unittest)
}
