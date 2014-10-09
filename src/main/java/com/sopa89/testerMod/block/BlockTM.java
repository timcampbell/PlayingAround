package com.sopa89.testerMod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.sopa89.testerMod.creativeTab.CreativeTabTM;

public class BlockTM extends Block
{
	public BlockTM(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabTM.TM_TAB);
	}
	
	public BlockTM()
	{
		super(Material.rock);
		this.setCreativeTab(CreativeTabTM.TM_TAB);
	}
}
