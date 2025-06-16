plugins {
    application
    id("com.github.ben-manes.versions") version "0.51.0"
    id("java")
    id("org.sonarqube") version "6.2.0.5505"
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("hexlet.code.App")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

sonar {
    properties {
        property("sonar.projectKey", "Dron92-dev_java-project-61")
        property("sonar.organization", "dron92-dev")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.token", "96df948097207eb880ad95a5a263e889dd3672c7")
    }
}