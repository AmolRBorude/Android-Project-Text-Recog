plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.amol.textrecognization"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.amol.textrecognization"
        minSdk = 24
        targetSdk = 35
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
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    dependencies {
        // To recognize Latin script
        implementation("com.google.android.gms:play-services-mlkit-text-recognition:19.0.1")

        // To recognize Chinese script
        implementation("com.google.android.gms:play-services-mlkit-text-recognition-chinese:16.0.1")

        // To recognize Devanagari script
        implementation("com.google.android.gms:play-services-mlkit-text-recognition-devanagari:16.0.1")

        // To recognize Japanese script
        implementation("com.google.android.gms:play-services-mlkit-text-recognition-japanese:16.0.1")

        // To recognize Korean script
        implementation("com.google.android.gms:play-services-mlkit-text-recognition-korean:16.0.1")
    }
}