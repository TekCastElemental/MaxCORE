package com.maxCORE.library;

import com.maxCORE.common.maxCORE;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.item.Item;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.living.*;
import net.minecraft.entity.player.*;

public class Event_LivingDrops {

static double rand;

@SubscribeEvent
public void onEntityDrop(LivingDropsEvent event) {

    if (event.entityLiving instanceof EntityCow) {
       //The integer at the end relates to how many potato will be dropped.
        event.entityLiving.dropItem(maxCORE.cheese, 1);
    }
}
}