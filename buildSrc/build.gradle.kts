plugins {
	`kotlin-dsl`
}

repositories {
	jcenter()
}

dependencies {
	implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.21-2")
}

kotlinDslPluginOptions {
	experimentalWarning.set(false)
}
