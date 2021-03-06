plugins {
	java
	kotlin("jvm")
}

dependencies {

	val mockkVersion = "1.12.0"

	testImplementation("io.mockk:mockk:$mockkVersion")
	testImplementation("io.mockk:mockk-dsl-jvm:$mockkVersion")
}
