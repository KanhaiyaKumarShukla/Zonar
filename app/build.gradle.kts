plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.exa.android.reflekt"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.exa.android.reflekt"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
        isCoreLibraryDesugaringEnabled = true
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        buildConfig = true
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.play.services.safetynet)
    implementation(libs.androidx.browser)
    implementation(libs.firebase.firestore)
    implementation(libs.firebase.database)
    implementation(libs.firebase.auth.ktx)
    implementation(libs.androidx.runner)
    implementation(libs.androidx.runtime.livedata)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Stream Video SDK
    implementation(libs.stream.video.ui.compose)
    implementation(libs.stream.video.ui.previewdata)

    //for permission dialog
    implementation(libs.accompanist.permissions)

    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.1.5")

    //Hilt
    implementation("com.google.dagger:hilt-android:2.51.1")
    kapt("com.google.dagger:hilt-compiler:2.51.1")

    // hilt Navigation
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")

    //coil
    implementation("io.coil-kt:coil-compose:2.4.0")

    // HTML parsing
    implementation ("org.jsoup:jsoup:1.17.2")

    implementation ("androidx.room:room-runtime:2.6.1")
    kapt ("androidx.room:room-compiler:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")

    implementation("com.google.code.gson:gson:2.10.1")

    // map
    implementation("com.google.maps.android:maps-compose:6.4.1")
    implementation("com.google.android.gms:play-services-maps:19.1.0")

    // geofire
    implementation ("com.firebase:geofire-android:3.2.0")
    implementation("com.google.android.gms:play-services-location:21.0.1")

    // image
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation ("com.github.skydoves:landscapist-glide:2.2.12")
    kapt("com.github.bumptech.glide:compiler:4.16.0")


    implementation ("com.google.android.libraries.places:places:3.4.0")
    implementation ("com.google.maps.android:places-ktx:3.1.1")
    implementation ("androidx.activity:activity-ktx:1.10.1")
    implementation ("com.jakewharton.timber:timber:5.0.1")

    implementation ("androidx.compose.material:material-icons-extended:1.7.0")

}