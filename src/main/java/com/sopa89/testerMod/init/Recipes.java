package com.sopa89.testerMod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes 
{
	public static void init()
	{
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.wandHilt), "stickWood", new ItemStack(Items.dye, 1, 5)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.magicWand), "s  ", " h ", "  h", 's', Items.nether_star, 'h', "wandHilt"));
	}
}
