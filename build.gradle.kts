@file:Suppress("MagicNumber")
plugins {
    id("com.android.library")
}

android {
    compileSdk = 31
    buildToolsVersion = "30.0.3"

    defaultConfig {
        minSdk = 21
        targetSdk = 31

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_11)
        targetCompatibility(JavaVersion.VERSION_11)
    }
    namespace = "com.maxmind.db"
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}
