plugins {
	kotlin("jvm") version "1.8.10"
	application
}

group = "how.tdd"
version = "1.0.0-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
	testImplementation(kotlin("test"))
}

kotlin {
	jvmToolchain(19)
}

tasks.test {
	useJUnitPlatform()
}

application {
	mainClass.set("how.tdd.poker.PokerApp")
}
