package com.sopa89.testerMod.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.sopa89.testerMod.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler 
{
	public static Configuration config;
	public static boolean magicWandEnabled;
	public static int magicWandDurability;
	
	public static void init(File configFile)
	{
		if(config==null)
		{
			config=new Configuration(configFile);
			loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChanged(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration()
	{
		magicWandEnabled=config.getBoolean("wandEnabled", Configuration.CATEGORY_GENERAL, true, "Is the magic wand enabled as an item");
		magicWandDurability=config.getInt("wandDurability", Configuration.CATEGORY_GENERAL, 256, 10, 512, "number of times the magic wand can be used be for it breaks");
		
		if(config.hasChanged())
		{
			config.save();
		}
	}
	
}
