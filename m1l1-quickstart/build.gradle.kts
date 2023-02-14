plugins {
    kotlin("jvm")
}

val coroutinesVersion: String by project
val jacksonVersion: String by project

dependencies {
    testImplementation(kotlin("test-junit"))
}