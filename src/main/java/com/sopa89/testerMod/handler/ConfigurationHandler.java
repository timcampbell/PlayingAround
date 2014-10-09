package com.sopa89.testerMod.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.sopa89.testerMod.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler 
{
	public static Configuration config;
	public static boolean testValue=true;
	public static int startOreSpawn=16;
	
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
		testValue=config.getBoolean("testValue", Configuration.CATEGORY_GENERAL, true, "Test Configuration File");
		startOreSpawn=config.getInt("startOreSpawn", Configuration.CATEGORY_GENERAL, 16, 0, 45, "Start Level for Ore Spawns(Just a Test)");
		
		if(config.hasChanged())
		{
			config.save();
		}
	}
	
}
