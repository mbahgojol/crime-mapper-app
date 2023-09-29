@file:Suppress("unused")

import com.mbahgojol.convention.composeCompiler
import com.mbahgojol.convention.libsExt
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.compose.ComposeExtension

class ComposeMultiplatformConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        pluginManager.apply("org.jetbrains.compose")
        configureCompose()
    }
}

fun Project.configureCompose() {
    with(extensions.getByType<ComposeExtension>()) {
        kotlinCompilerPlugin.set(libsExt.composeCompiler)
    }
}
