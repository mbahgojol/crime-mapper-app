import com.mbahgojol.convention.androidMain
import com.mbahgojol.convention.commonMain
import com.mbahgojol.convention.iosMain

plugins {
    id("mbahgojol.kotlin.multiplatform")
}

kotlin {
    androidMain {
        dependencies {
            implementation(libs.ktor.client.okhttp)
        }
    }

    commonMain {
        dependencies {
            implementation(libs.ktor.client.core)
            implementation(projects.core.base)
        }
    }

    iosMain {
        dependencies {
            implementation(libs.ktor.client.darwin)
        }
    }
}
