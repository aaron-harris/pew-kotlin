rootProject.name = "pew-kotlin"

include("core")
include("cli")

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal {
            mavenContent { snapshotsOnly() }
        }
        maven {
            name = "gitHubPackages"
            url = uri("https://maven.pkg.github.com/aaron-harris/aph-gradle-conventions")

            // GitHub credentials should be set in ~/.gradle/gradle.properties or via CLI
            credentials(PasswordCredentials::class)
        }
    }
}
