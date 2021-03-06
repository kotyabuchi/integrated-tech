package com.github.kotyabuchi.integratedtech

import com.github.kotyabuchi.integratedtech.block.ModBlocks
import com.github.kotyabuchi.integratedtech.item.ModItems
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import net.minecraftforge.fml.event.server.FMLServerAboutToStartEvent
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import thedarkcolour.kotlinforforge.forge.FORGE_BUS
import thedarkcolour.kotlinforforge.forge.MOD_BUS

@Mod(IntegratedTech.ID)
object IntegratedTech {
    // the modid of our mod
    const val ID: String = "integratedtech"

    // the logger for our mod
    val LOGGER: Logger = LogManager.getLogger()

    object CreativeTab: ItemGroup(ID) {
        override fun makeIcon(): ItemStack {
            return ItemStack(ModItems.INGOTS[MetalType.COPPER])
        }
    }

    init {
        LOGGER.log(Level.INFO, "Hello world!")

        // Register the KDeferredRegister to the mod-specific event bus
        ModBlocks.REGISTRY.register(MOD_BUS)
        ModItems.REGISTRY.register(MOD_BUS)

        // usage of the KotlinEventBus
        MOD_BUS.addListener(::onClientSetup)
        FORGE_BUS.addListener(::onServerAboutToStart)
    }

    /**
     * This is used for initializing client specific
     * things such as renderers and keymaps
     * Fired on the mod specific event bus.
     */
    private fun onClientSetup(event: FMLClientSetupEvent) {
        LOGGER.log(Level.INFO, "Initializing client...")
    }

    /**
     * Fired on the global Forge bus.
     */
    private fun onServerAboutToStart(event: FMLServerAboutToStartEvent) {
        LOGGER.log(Level.INFO, "Server starting...")
    }
}