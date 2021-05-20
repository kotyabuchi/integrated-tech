package com.github.kotyabuchi.integratedtech.item

import com.github.kotyabuchi.integratedtech.CreativeTab
import com.github.kotyabuchi.integratedtech.IntegratedTech
import net.minecraft.item.Item
import net.minecraftforge.registries.ForgeRegistries
import thedarkcolour.kotlinforforge.forge.KDeferredRegister
import thedarkcolour.kotlinforforge.forge.ObjectHolderDelegate

object ModItems {
    val REGISTRY = KDeferredRegister(ForgeRegistries.ITEMS, IntegratedTech.ID)

    val INGOTS = mutableMapOf<MetalType, ObjectHolderDelegate<Item>>()

    init {
        MetalType.values().forEach {
            INGOTS[it] = REGISTRY.registerObject(it.name.lowercase() + "_ingot"){ Item(Item.Properties().tab(CreativeTab)) }
        }
    }
}