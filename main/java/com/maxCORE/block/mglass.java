package com.maxCORE.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class mglass extends Block{

	
	
	@Override
    public boolean isOpaqueCube()
{
    return false;
}
	
	public mglass(int i, Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
		this.setHardness(0.3f);
		this.setResistance(0f);
		this.setLightLevel(0f);
		
		
		
		
		
	}

}
