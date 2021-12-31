package com.github.grapoisvip.my_first_mod.core;

import com.github.grapoisvip.my_first_mod.MyFirstMod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.ToolItem;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MyFirstMod.MOD_ID);
	
	public static final RegistryObject<BlockItem> ROCK_BLOCK = ITEMS.register("rock",
			() -> new BlockItem(BlockInit.ROCK_BLOCK.get(), new Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> ANDROANTHUS_SAPLING = ITEMS.register("androanthus_sapling",
			() -> new BlockItem(BlockInit.ANDROANTHUS_SAPLING.get(), new Properties().tab(ItemGroup.TAB_DECORATIONS)));
	
	public static final RegistryObject<Item> SCREWDRIVER_TOOL = ITEMS.register("screwdriver_tool",
			() -> new ToolItem(1f, 0, ItemTier.IRON, null, new Properties().tab(ItemGroup.TAB_TOOLS)));
}
