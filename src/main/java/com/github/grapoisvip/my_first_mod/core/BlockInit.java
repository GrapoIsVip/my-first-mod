package com.github.grapoisvip.my_first_mod.core;

import com.github.grapoisvip.my_first_mod.MyFirstMod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BushBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MyFirstMod.MOD_ID);
	
	public static final RegistryObject<Block> ROCK_BLOCK = BLOCKS.register("rock",
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)));
	
	public static final RegistryObject<Block> ANDROANTHUS_SAPLING = BLOCKS.register("androanthus_sapling",
			() -> new BushBlock(AbstractBlock.Properties.of(Material.PLANT, MaterialColor.PLANT)
					.sound(SoundType.GRASS)
					.noCollission()
					.instabreak()
					.randomTicks()));
}
