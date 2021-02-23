plugins {
   java
   kotlin("jvm") version "1.4.30"
}

group = "org.meowcat"
version = "0.0.1"

repositories {
   mavenCentral()
   jcenter()
   maven("https://jitpack.io")
}
val vertxVersion = "4.0.0"

tasks {
   withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
      kotlinOptions {
         jvmTarget = "1.8"
         freeCompilerArgs += listOf("-Xinline-classes", "-Xopt-in=kotlin.RequiresOptIn")
      }
      sourceCompatibility = "1.8"
   }
}
dependencies {
   // vertx
   implementation("io.vertx:vertx-core:$vertxVersion")
   implementation("io.vertx:vertx-web:$vertxVersion")
   implementation("io.vertx:vertx-lang-kotlin-coroutines:$vertxVersion")
   implementation("io.vertx:vertx-lang-kotlin:$vertxVersion")
   implementation("io.vertx:vertx-ignite:$vertxVersion")
   // kotlin
   implementation(Dependency.Kotlin.StdLib)
   implementation(Dependency.KotlinX.Coroutine)
   implementation(Dependency.Kotlin.StbLib7)
   implementation(Dependency.Kotlin.StbLib8)

   implementation("com.github.meowcat-studio:handy-dandy:0.0.5")

   // jackson
   implementation(Dependency.Jackson.Core)
   implementation(Dependency.Jackson.DataBind)
   implementation(Dependency.Jackson.Annotations)
   implementation(Dependency.Jackson.KotlinModule)
   // logging
   implementation("org.slf4j:slf4j-api:1.7.30")
   implementation("io.github.microutils:kotlin-logging-jvm:2.0.2")
   implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.14.0")
   implementation("org.apache.logging.log4j:log4j-core:2.14.0")
   implementation("org.apache.logging.log4j:log4j-api:2.14.0")
}
object Versions {
   const val Kotlin = "1.4.30"
   const val Okhttp = "4.9.0"
   const val Ktor = "1.5.0"
   const val Coroutine = "1.4.1"
   const val Jackson = "2.12.1"
   const val Slf4j = "1.7.30"
   const val Mirai = "2.3.2"
   const val ShadowJar = "6.1.0"
   const val Vertx = "4.0.0"
}
object Dependency {
   object Kotlin {
      private const val group = "org.jetbrains.kotlin"
      const val StdLib = "$group:kotlin-stdlib:${Versions.Kotlin}"
      const val StbLib7 = "$group:kotlin-stdlib-jdk7:${Versions.Kotlin}"
      const val StbLib8 = "$group:kotlin-stdlib-jdk8:${Versions.Kotlin}"
      const val Reflect = "$group:kotlin-reflect:${Versions.Kotlin}"
   }
   object KotlinX {
      private const val group = "org.jetbrains.kotlinx"
      const val Coroutine = "$group:kotlinx-coroutines-core:${Versions.Coroutine}"
   }
   object Ktor {
      private const val group = "io.ktor"
      const val Core = ""
      object Client {
         const val WebSocket = "$group:ktor-client-websockets:${Versions.Ktor}"
         const val CIO = "$group:ktor-client-cio:${Versions.Ktor}"
      }
   }
   object Jackson {
      private const val group = "com.fasterxml.jackson"
      const val Core = "$group.core:jackson-core:${Versions.Jackson}"
      const val DataBind = "$group.core:jackson-databind:${Versions.Jackson}"
      const val Annotations = "$group.core:jackson-annotations:${Versions.Jackson}"
      const val KotlinModule = "$group.module:jackson-module-kotlin:${Versions.Jackson}"
   }
   const val Okhttp = "com.squareup.okhttp3:okhttp:${Versions.Okhttp}"
   const val Slf4j = "org.slf4j:slf4j-api:${Versions.Slf4j}"
}
