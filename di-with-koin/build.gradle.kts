import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	`kotlin-project`
	`junit-project`
	`assertj-project`
	`mockito-kotlin-project`
	`integration-test-suite`
}

dependencies {

	val koinVersion = "3.1.2"

	api("io.insert-koin:koin-core-jvm:$koinVersion")

	implementation("io.insert-koin:koin-core:$koinVersion")

	compileOnly("org.jetbrains:annotations:21.0.1")

	"integrationTestImplementation"("io.insert-koin:koin-test-junit5:$koinVersion")
}

tasks {

	withType<KotlinCompile>().configureEach {
		kotlinOptions.freeCompilerArgs += "-Xinline-classes"
		kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
	}
}
