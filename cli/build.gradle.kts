import com.diffplug.gradle.spotless.BaseKotlinExtension
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    kotlin("jvm") version "2.0.0"
    application

    alias(libs.plugins.spotless)
    alias(libs.plugins.detekt)
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

dependencies {
    testImplementation(libs.bundles.unittest)
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        events(
            TestLogEvent.PASSED,
            TestLogEvent.SKIPPED,
            TestLogEvent.FAILED,
            TestLogEvent.STANDARD_OUT,
            TestLogEvent.STANDARD_ERROR,
        )
    }
}

spotless {
    val sharedKtlint: BaseKotlinExtension.() -> Unit = {
        ktlint(libs.versions.ktlint.get())
            .setEditorConfigPath("$rootDir/.editorconfig")
    }

    kotlin {
        sharedKtlint()
    }
    kotlinGradle {
        sharedKtlint()
    }
}

detekt {
    source.setFrom(
        "src/main/kotlin",
        "src/test/kotlin",
        "build.gradle.kts",
    )
}
