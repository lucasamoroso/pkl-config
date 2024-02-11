package main

import ApplicationConfig
import org.pkl.config.java.ConfigEvaluator
import org.pkl.config.kotlin.forKotlin
import org.pkl.config.kotlin.to
import org.pkl.core.ModuleSource


fun main() {
    val config = ConfigEvaluator.preconfigured().forKotlin().use { evaluator ->
        evaluator.evaluate(ModuleSource.modulePath("config.pkl"))
    }

    val appConfig = config.to<ApplicationConfig>()
    println(appConfig)
}