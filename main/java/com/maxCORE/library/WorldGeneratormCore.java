package com.maxCORE.library;

import java.util.Random;

import com.maxCORE.common.maxCORE;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;


public class WorldGeneratormCore implements IWorldGenerator {

@Override
public void generate(Random random, int chunkX, int chunkZ, World world,
IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
// TODO Auto-generated method stub
switch(world.provider.dimensionId){
//case -1: generateNether(world, random,chunkX*16,chunkZ*16);
case 0 : generateSurface(world, random,chunkX*16,chunkZ*16);
}
}


private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
for(int i =0; i<50;i++){
int Xcoord = BlockX + random.nextInt(16);
int Zcoord = BlockZ + random.nextInt(16);
int Ycoord = random.nextInt(16);

(new WorldGenMinable(maxCORE.marble, 4)).generate(world, random, Xcoord, Ycoord, Zcoord);
}}}

