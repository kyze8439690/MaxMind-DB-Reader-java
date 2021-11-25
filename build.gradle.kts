plugins {
    id("com.android.library")
}

android {
    compileSdkVersion(31)
    buildToolsVersion("30.0.3")

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(31)

        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}