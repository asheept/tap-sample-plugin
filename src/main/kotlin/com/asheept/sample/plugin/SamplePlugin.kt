package com.asheept.sample.plugin

import org.bukkit.plugin.java.JavaPlugin

/**
 * @author Noonmaru
 */
class SamplePlugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("Hello Kotlin Plugin!")
    }
}