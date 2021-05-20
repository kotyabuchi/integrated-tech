package com.github.kotyabuchi.integratedtech

import com.github.kotyabuchi.integratedtech.item.MetalType
import com.github.kotyabuchi.integratedtech.item.ModItems
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack

object CreativeTab: ItemGroup(IntegratedTech.ID) {

    override fun makeIcon(): ItemStack {
        return ItemStack(ModItems.INGOTS[MetalType.COPPER])
    }
}