plugins {
    id("org.pkl-lang") version "0.25.2"
    // if the `idea` plugin is applied, the Pkl plugin makes generated code visible to IntelliJ IDEA
    idea
//    `java-library`
    id("org.jetbrains.kotlin.jvm") version "1.9.22"

}

repositories {
    mavenCentral()
}


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.10")
    implementation("org.pkl-lang:pkl-config-kotlin:0.25.1")
}

pkl {
    kotlinCodeGenerators {
        register("configClasses") {
            sourceModules.set(files("src/main/resources/ApplicationConfig.pkl"))
            generateKdoc.set(true)
        }
    }
}