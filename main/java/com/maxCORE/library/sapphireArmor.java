package com.maxCORE.library;



import com.maxCORE.common.maxCORE;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class sapphireArmor extends ItemArmor{
private String [] armourTypes = new String [] {"helmetSapphire", "chestplateSapphire", "legsSapphire", "bootsSapphire"};

public sapphireArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
super(armorMaterial, renderIndex, armourType);
}

@Override
public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
if(stack.getItem().equals(maxCORE.helmetSapphire)|| stack.getItem().equals(maxCORE.chestplateSapphire)|| stack.getItem().equals(maxCORE.bootsSapphire)){
return "maxCORE:textures/armor/sapphire_1.png";
}

if(stack.getItem().equals(maxCORE.legsSapphire)){
return "maxCORE:textures/armor/sapphire_2.png";
}

else return null;
}

@Override
public void registerIcons(IIconRegister reg){
if(this == maxCORE.helmetSapphire)
this.itemIcon = reg.registerIcon("maxCORE:helmetSapphire");
if(this == maxCORE.chestplateSapphire)
this.itemIcon = reg.registerIcon("maxCORE:chestplateSapphire");
if(this == maxCORE.legsSapphire)
this.itemIcon = reg.registerIcon("maxCORE:legsSapphire");
if(this == maxCORE.bootsSapphire)
this.itemIcon = reg.registerIcon("maxCORE:bootsSapphire");
}

}

