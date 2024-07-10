plugins {
    alias(libs.plugins.aph.kotlin)
}

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

dependencies {
    testImplementation(libs.bundles.unittest)
}
