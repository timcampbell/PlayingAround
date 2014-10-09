package com.sopa89.testerMod.creativeTab;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

import com.sopa89.testerMod.reference.Reference;

public class CreativeTabTM
{

	public static final CreativeTabs TM_TAB=new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return Items.blaze_rod;
		}
	};

}
