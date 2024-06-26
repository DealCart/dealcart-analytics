import java.net.URI

//plugins {
//    alias(libs.plugins.androidLibrary)
//    alias(libs.plugins.jetbrainsKotlinAndroid)
//    `maven-publish`
////    alias(libs.plugins.kotlin).apply(false)
////    alias(libs.plugins.mavenPublish).apply(false)
//
//}

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
//    id("com.google.firebase.crashlytics")
//    id("com.google.gms.google-services")
    id("maven-publish")
}




android {
    namespace = "io.dealcart.analytics"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

afterEvaluate {
    publishing {
        publications {
            register<MavenPublication>("release") {
                groupId = "com.github.dealcart"
                artifactId = "dealcart-analytics"
                version = "1.0.2"
            }
        }
    }
}