package com.sopa89.testerMod.init;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.OreDictionary;

import com.sopa89.testerMod.handler.ConfigurationHandler;
import com.sopa89.testerMod.item.ItemMagicWand;
import com.sopa89.testerMod.item.ItemTM;
import com.sopa89.testerMod.item.ItemWandHilt;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static ItemTM magicWand=new ItemMagicWand();
	public static ItemTM wandHilt=new ItemWandHilt();
	
	public static void init()
	{
		if(ConfigurationHandler.magicWandEnabled)
		{
			GameRegistry.registerItem(magicWand, "magicWand");
			OreDictionary.registerOre("wandMagic", magicWand);
			
			GameRegistry.registerItem(wandHilt, "wandHilt");
			OreDictionary.registerOre("wandHilt", wandHilt);
		}
	}
}
