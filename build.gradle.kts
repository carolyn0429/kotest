import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.0"
}
group = "me.carolyn_hung"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    implementation("io.kotest:kotest-runner-junit5-jvm:4.1.1")
    testImplementation(kotlin("test-junit5"))
    testImplementation("io.kotest:kotest-runner-junit5:4.3.0") // for kotest framework
    testImplementation("io.kotest:kotest-assertions-core:4.3.0") // for kotest core jvm assertions
    testImplementation("io.kotest:kotest-property:4.3.0") // for kotest property test
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}