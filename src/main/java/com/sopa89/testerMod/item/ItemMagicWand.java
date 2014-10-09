package com.sopa89.testerMod.item;

import java.util.Random;

import com.sopa89.testerMod.handler.ConfigurationHandler;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemMagicWand extends ItemTM
{
	public ItemMagicWand()
	{
		super();
		this.setUnlocalizedName("magicWand");
		this.setMaxStackSize(1);
		this.setMaxDamage(ConfigurationHandler.magicWandDurability);
	}
	
	@Override
	public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer player, EntityLivingBase target)
	{
		if(!player.worldObj.isRemote)
		{
			Random rand=new Random();
			if(target instanceof EntitySheep)
			{
				((EntitySheep) target).setFleeceColor(rand.nextInt(16));
				stack.damageItem(1, player);
			}
			else if(target instanceof EntityCow && !(target instanceof EntityMooshroom))
			{
				if(rand.nextInt(100)<=5)
				{
					EntityMooshroom newShroom=new EntityMooshroom(player.worldObj);
					
					newShroom.setGrowingAge(((EntityCow)target).getGrowingAge());
					
					newShroom.setPosition(target.posX, target.posY, target.posZ);
					
					target.setDead();
					player.worldObj.spawnEntityInWorld(newShroom);
					
					stack.damageItem(1, player);
				}
			}
		}
		return false;
	}
}
