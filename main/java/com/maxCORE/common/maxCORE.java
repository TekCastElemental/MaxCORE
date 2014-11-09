package com.maxCORE.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import com.maxCORE.block.mBLOCK;
import com.maxCORE.library.CreativeTabsmaxCORE;
import com.maxCORE.library.Event_LivingDrops;
import com.maxCORE.library.WorldGeneratorMCORESAPPHIREBLOCK;
import com.maxCORE.library.WorldGeneratormCore;
import com.maxCORE.library.sapphireArmor;


//maxCORE v0.12; MinePLUS Resurrection. Can't be taken down now, full of new items, tools, and food.







//PROXY SETUP
@Mod(modid = "maxCORE", name = "maxCORE")
public class maxCORE {
@SidedProxy(clientSide = "com.maxCORE.common.ClientProxy", serverSide = "com.maxCORE.common.CommonProxy")
public static CommonProxy proxy;
	

@EventHandler
public void preInit(FMLPreInitializationEvent event)  {
	
    	MinecraftForge.EVENT_BUS.register(new Event_LivingDrops());
    
    	System.out.println("Event Handler Initialized");
	
}






	public static CreativeTabs tabmaxCORE = new CreativeTabsmaxCORE("maxCORE");

	
	
	
	
	
	//TOOLMATERIALS
	
	public static ToolMaterial toolStrongDiamond = net.minecraftforge.common.util.EnumHelper.addToolMaterial("STRONGDIAMOND", 3, 2000, 15.0F, 10.0F, 8);
	public static ToolMaterial toolStrongIron = net.minecraftforge.common.util.EnumHelper.addToolMaterial("STRONGIRON", 4, 1700, 10.0F, 5.0F, 10);
	public static ToolMaterial toolOBDIAMOND = net.minecraftforge.common.util.EnumHelper.addToolMaterial("OBDIAMOND", 5, 2361, 18.0F, 12.0F, 10);
	public static ToolMaterial toolOBIRON = net.minecraftforge.common.util.EnumHelper.addToolMaterial("OBIRON", 6, 2060, 11.0F, 10.0F, 10);
	
	
	
	
	
	
	//PUBLIC BLOCK INSERTION
	

	public static Block mBLOCK = new mBLOCK(3000, Material.rock).setBlockName("mBLOCK").setBlockTextureName("maxCORE:mBLOCK");
	public static Block gLAMP = new com.maxCORE.block.gLAMP(3001, Material.glass).setBlockName("gLAMP").setBlockTextureName("maxCORE:gLAMP");
	public static Block rLAMP = new com.maxCORE.block.rLAMP(3002, Material.glass).setBlockName("rLAMP").setBlockTextureName("maxCORE:rLAMP");
	public static Block yLAMP = new com.maxCORE.block.yLAMP(3003, Material.glass).setBlockName("yLAMP").setBlockTextureName("maxCORE:yLAMP");
	public static Block pLAMP = new com.maxCORE.block.pLAMP(3003, Material.glass).setBlockName("pLAMP").setBlockTextureName("maxCORE:pLAMP");
	public static Block mLAMP = new com.maxCORE.block.mLAMP(3003, Material.glass).setBlockName("mLAMP").setBlockTextureName("maxCORE:mLAMP");
	public static Block bLAMP = new com.maxCORE.block.bLAMP(3003, Material.glass).setBlockName("bLAMP").setBlockTextureName("maxCORE:bLAMP");
	public static Block brLAMP = new com.maxCORE.block.brLAMP(3003, Material.glass).setBlockName("brLAMP").setBlockTextureName("maxCORE:brLAMP");
	public static Block wwalling = new com.maxCORE.block.wwalling(3004, Material.rock).setBlockName("wwalling").setBlockTextureName("maxCORE:wwalling");
	public static Block marble = new com.maxCORE.block.marble(3005, Material.rock).setBlockName("marble").setBlockTextureName("maxCORE:marble");
	public static Block wLAMP = new com.maxCORE.block.wLAMP(3006, Material.glass).setBlockName("wLAMP").setBlockTextureName("maxCORE:wLAMP");
	public static Block mglass = new com.maxCORE.block.mglass(3007, Material.glass).setBlockName("mglass").setBlockTextureName("maxCORE:mglass");
	public static Block swood = new com.maxCORE.block.swood(3008, Material.wood).setBlockName("swood").setBlockTextureName("maxCORE:swood");
	public static Block bwood = new com.maxCORE.block.bwood(3009, Material.wood).setBlockName("bwood").setBlockTextureName("maxCORE:bwood");
	public static Block bbrick = new com.maxCORE.block.bbrick(3010, Material.rock).setBlockName("bbrick").setBlockTextureName("maxCORE:bbrick");
	public static Block gbrick = new com.maxCORE.block.gbrick(3010, Material.rock).setBlockName("gbrick").setBlockTextureName("maxCORE:gbrick");
	public static Block pbrick = new com.maxCORE.block.pbrick(3010, Material.rock).setBlockName("pbrick").setBlockTextureName("maxCORE:pbrick");
	public static Block mbrick = new com.maxCORE.block.mbrick(3011, Material.rock).setBlockName("mbrick").setBlockTextureName("maxCORE:mbrick");
	public static Block blbrick = new com.maxCORE.block.blbrick(3011, Material.rock).setBlockName("blbrick").setBlockTextureName("maxCORE:blbrick");
	public static Block ybrick = new com.maxCORE.block.ybrick(3011, Material.rock).setBlockName("ybrick").setBlockTextureName("maxCORE:ybrick");
	public static Block sORE = new com.maxCORE.block.sORE(3056, Material.rock).setBlockName("sORE").setBlockTextureName("maxCORE:sORE");
	
	
	//PUBLIC TOOL INSERTION
	
	
	
	public static Item singot = new Item().setUnlocalizedName("singot").setTextureName("maxCORE:singot").setCreativeTab(tabmaxCORE);
	public static Item steeldagger = new com.maxCORE.item.steeldagger(3001, maxCORE.toolStrongIron).setUnlocalizedName("steeldagger").setTextureName("maxCORE:sDagger");
	public static Item treetap = new Item().setUnlocalizedName("treetap").setTextureName("maxCORE:treetap").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	
	//TOOLS: RD
	public static Item RDpick = new com.maxCORE.item.RDpick(3022, maxCORE.toolStrongDiamond).setUnlocalizedName("RDpick").setTextureName("maxCORE:RDpickaxe").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	public static Item RDaxe = new com.maxCORE.item.RDaxe(3023, maxCORE.toolStrongDiamond).setUnlocalizedName("RDaxe").setTextureName("maxCORE:RDaxe").setCreativeTab(tabmaxCORE);
	public static Item RDspade = new com.maxCORE.item.RDspade(3024, maxCORE.toolStrongDiamond).setUnlocalizedName("RDspade").setTextureName("maxCORE:RDspade").setCreativeTab(tabmaxCORE);
	public static Item RDsword = new com.maxCORE.item.RDsword(3025, maxCORE.toolStrongDiamond).setUnlocalizedName("RDsword").setTextureName("maxCORE:RDsword").setCreativeTab(tabmaxCORE);
	
	//TOOLS: OHI
	public static Item OHIpick = new com.maxCORE.item.OHIpick(3088, maxCORE.toolOBIRON).setUnlocalizedName("OHIpick").setTextureName("maxCORE:OHIPICK").setCreativeTab(tabmaxCORE);
	public static Item OHIaxe = new com.maxCORE.item.OHIaxe(3088, maxCORE.toolOBIRON).setUnlocalizedName("OHIaxe").setTextureName("maxCORE:OHIAXE").setCreativeTab(tabmaxCORE);
	public static Item OHIspade = new com.maxCORE.item.OHIspade(3088, maxCORE.toolOBIRON).setUnlocalizedName("OHIspade").setTextureName("maxCORE:OHISPADE").setCreativeTab(tabmaxCORE);
	public static Item OHIsword = new com.maxCORE.item.OHIsword(3088, maxCORE.toolOBIRON).setUnlocalizedName("OHIsword").setTextureName("maxCORE:OHISWORD").setCreativeTab(tabmaxCORE);
	
	
	
	public static ArmorMaterial enumArmorMaterialSapphire = EnumHelper.addArmorMaterial("SAPPHIRE", 15, new int[]{3, 7, 6, 3}, 14);
	
	
	//TOOLS: OHD
	public static Item DOHpick = new com.maxCORE.item.DOHpick(3026, maxCORE.toolOBDIAMOND).setUnlocalizedName("DOHpick").setTextureName("maxCORE:DOHpick").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	public static Item DOHaxe = new com.maxCORE.item.DOHaxe(3026, maxCORE.toolOBDIAMOND).setUnlocalizedName("DOHaxe").setTextureName("maxCORE:DOHaxe").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	public static Item DOHspade = new com.maxCORE.item.DOHspade(3026, maxCORE.toolOBDIAMOND).setUnlocalizedName("DOHspade").setTextureName("maxCORE:DOHspade").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	public static Item DOHsword = new com.maxCORE.item.DOHsword(3026, maxCORE.toolOBDIAMOND).setUnlocalizedName("DOHsword").setTextureName("maxCORE:DOHsword").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	
	//TOOLS: RI
	public static Item IDpick = new com.maxCORE.item.IDpick(3066, maxCORE.toolStrongIron).setUnlocalizedName("IDpick").setTextureName("maxCORE:IDPICK").setCreativeTab(tabmaxCORE);
	public static Item IDaxe = new com.maxCORE.item.IDaxe(3067, maxCORE.toolStrongIron).setUnlocalizedName("IDaxe").setTextureName("maxCORE:IDAXE").setCreativeTab(tabmaxCORE);
	public static Item IDspade = new com.maxCORE.item.IDspade(3068, maxCORE.toolStrongIron).setUnlocalizedName("IDspade").setTextureName("maxCORE:IDSPADE").setCreativeTab(tabmaxCORE);
	public static Item IDsword = new com.maxCORE.item.IDsword(3069, maxCORE.toolStrongIron).setUnlocalizedName("IDsword").setTextureName("maxCORE:IDSWORD").setCreativeTab(tabmaxCORE);
	
	
	//TOOLS: SWIS
	public static Item spick =  new com.maxCORE.item.spick(3066, maxCORE.toolStrongIron).setUnlocalizedName("spick").setTextureName("maxCORE:SPICK").setCreativeTab(tabmaxCORE);
	public static Item saxe =  new com.maxCORE.item.saxe(3066, maxCORE.toolStrongIron).setUnlocalizedName("saxe").setTextureName("maxCORE:SAXE").setCreativeTab(tabmaxCORE);
	public static Item sspade =  new com.maxCORE.item.sspade(3066, maxCORE.toolStrongIron).setUnlocalizedName("sspade").setTextureName("maxCORE:SSPADE").setCreativeTab(tabmaxCORE);
	public static Item ssword =  new com.maxCORE.item.ssword(3066, maxCORE.toolStrongIron).setUnlocalizedName("ssword").setTextureName("maxCORE:SSWORD").setCreativeTab(tabmaxCORE);
	
	
	
	//PUBLIC ITEM INSERTION
	
	
	
	
	
	public static Item eggs = new ItemFood(32, 10, false).setUnlocalizedName("eggs").setTextureName("maxCORE:eggs").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	public static Item wheatdonut = new ItemFood(32, 5, false).setUnlocalizedName("wheatdonut").setTextureName("maxCORE:wdonut").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	public static Item chocdonut = new ItemFood(32, 5, false).setUnlocalizedName("chocdonut").setTextureName("maxCORE:cdonut").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	public static Item sugdonut = new ItemFood(32, 5, false).setUnlocalizedName("sugdonut").setTextureName("maxCORE:sdonut").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	public static Item IronStick = new Item().setUnlocalizedName("IronStick").setTextureName("maxCORE:ironstick").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	public static Item sap = new Item().setUnlocalizedName("sap").setTextureName("maxCORE:sap").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	public static Item mpancake = new ItemFood(32, 5, false).setUnlocalizedName("mpancake").setTextureName("maxCORE:mpan").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	public static Item fsticks = new ItemFood(32, 5, false).setUnlocalizedName("fsticks").setTextureName("maxCORE:fstick").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	public static Item icecream = new ItemFood(32, 5, false).setUnlocalizedName("icecream").setTextureName("maxCORE:icecream").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	public static Item cheese = new ItemFood(32, 5, false).setUnlocalizedName("cheese").setTextureName("maxCORE:cheese").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	public static Item pancake = new ItemFood(32, 5, false).setUnlocalizedName("pancake").setTextureName("maxCORE:panc").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);
	public static Item syrup = new Item().setUnlocalizedName("syrup").setTextureName("maxCORE:syrup").setCreativeTab(com.maxCORE.common.maxCORE.tabmaxCORE);






	public static Item chestplateSapphire;
	
	int chestplateSapphireID = 607;
	
	
	public static Item helmetSapphire;
	
	int helmetSapphireID = 608;
	
	public static Item legsSapphire;
	
	int legsSapphireID = 609;
	
	public static Item bootsSapphire;
	
	int bootsID = 610;
	
	
	
	public maxCORE() {
		
		//FOOD CRAFTING
		GameRegistry.addSmelting(Items.egg, new ItemStack(eggs), 0.1f);
		GameRegistry.addShapelessRecipe(new ItemStack(sap, 1), new Object[]{new ItemStack(Blocks.log, 1, 0), treetap});
		GameRegistry.addShapelessRecipe(new ItemStack(syrup, 1), new Object[]{sap, Items.bucket});
		GameRegistry.addRecipe(new ItemStack(pancake, 1), new Object[]{"   ", "xxx", "xxx", 'x', Items.wheat});
		GameRegistry.addShapelessRecipe(new ItemStack(mpancake, 1), new Object[]{pancake, syrup});
		GameRegistry.addRecipe(new ItemStack(icecream, 1), new Object[]{" x ", " t ", " t ", 't', Items.wheat, 'x', Items.milk_bucket});
		GameRegistry.addRecipe(new ItemStack(wheatdonut, 1), new Object[]{"xxx", "x x", "xxx", 'x', Items.wheat});
		GameRegistry.addShapelessRecipe(new ItemStack(chocdonut, 1), new Object[]{wheatdonut, new ItemStack(Items.dye, 1, 3)});
		GameRegistry.addShapelessRecipe(new ItemStack(sugdonut, 1), new Object[]{Items.sugar, wheatdonut});
		GameRegistry.addSmelting(new ItemStack(Items.fish, 1, 0), new ItemStack(fsticks), 0.1f);
		

		
		//BLOCK REGISTRY
		
		GameRegistry.registerBlock(mBLOCK, "mBLOCK");
		GameRegistry.registerBlock(gLAMP, "gLAMP");
		GameRegistry.registerBlock(rLAMP, "rLAMP");
		GameRegistry.registerBlock(yLAMP, "yLAMP");
		GameRegistry.registerBlock(pLAMP, "pLAMP");
		GameRegistry.registerBlock(mLAMP, "mLAMP");
		GameRegistry.registerBlock(bLAMP, "bLAMP");
		GameRegistry.registerBlock(brLAMP, "brLAMP");
		GameRegistry.registerBlock(marble, "marble");
		GameRegistry.registerBlock(wwalling, "wwalling");
		GameRegistry.registerBlock(wLAMP, "wLAMP");
		GameRegistry.registerBlock(mglass, "mglass");
		GameRegistry.registerBlock(bwood, "bwood");
		GameRegistry.registerBlock(swood, "swood");
		GameRegistry.registerBlock(bbrick, "bbrick");
		GameRegistry.registerBlock(pbrick, "pbrick");
		GameRegistry.registerBlock(gbrick, "gbrick");
		GameRegistry.registerBlock(blbrick, "blbrick");
		GameRegistry.registerBlock(mbrick, "mbrick");
		GameRegistry.registerBlock(ybrick, "ybrick");
		GameRegistry.registerBlock(sORE, "sORE");
		
		
		

		
		RenderingRegistry.addNewArmourRendererPrefix("5");
		
		
		helmetSapphire = new sapphireArmor(maxCORE.enumArmorMaterialSapphire, 5, 0).setUnlocalizedName("helmetSapphire").setCreativeTab(tabmaxCORE);
		chestplateSapphire = new sapphireArmor(maxCORE.enumArmorMaterialSapphire, 5, 1).setUnlocalizedName("chestplateSapphire").setCreativeTab(tabmaxCORE);
		legsSapphire = new sapphireArmor(maxCORE.enumArmorMaterialSapphire, 5, 2).setUnlocalizedName("legsSapphire").setCreativeTab(tabmaxCORE);
		bootsSapphire = new sapphireArmor(maxCORE.enumArmorMaterialSapphire, 5, 3).setUnlocalizedName("bootsSapphire").setCreativeTab(tabmaxCORE);
		
		//TOOLCRAFTING
		
		GameRegistry.addRecipe(new ItemStack(RDpick, 1), new Object[]{"xxx", " t ", " t ", 't', IronStick, 'x', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(RDaxe, 1), new Object[]{" xx", " tx", " t ", 'x', Items.diamond, 't', IronStick});
		GameRegistry.addRecipe(new ItemStack(RDspade, 1), new Object[]{" x ", " t ", " t ", 't', IronStick, 'x', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(RDsword, 1), new Object[]{" x ", " x ", " t ", 'x', Items.diamond, 't', IronStick});
		
		
		GameRegistry.addRecipe(new ItemStack(spick, 1), new Object[]{"xxx", " t ", " t ", 't', IronStick, 'x', singot});
		GameRegistry.addRecipe(new ItemStack(saxe, 1), new Object[]{" xx", " tx", " t ", 'x', singot, 't', IronStick});
		GameRegistry.addRecipe(new ItemStack(sspade, 1), new Object[]{" x ", " t ", " t ", 't', IronStick, 'x', singot});
		GameRegistry.addRecipe(new ItemStack(ssword, 1), new Object[]{" x ", " x ", " t ", 'x', singot, 't', IronStick});
		
		GameRegistry.addRecipe(new ItemStack(helmetSapphire, 1), new Object[]{"xxx", "x x", "   ", 'x', singot});
		GameRegistry.addRecipe(new ItemStack(chestplateSapphire, 1), new Object[]{"x x", "xxx", "xxx", 'x', singot});
		GameRegistry.addRecipe(new ItemStack(legsSapphire, 1), new Object[]{"xxx", "x x", "x x", 'x', singot});
		GameRegistry.addRecipe(new ItemStack(bootsSapphire, 1), new Object[]{"   ", "x x", "x x", 'x', singot});
		
		GameRegistry.addRecipe(new ItemStack(IDpick, 1), new Object[]{"xxx", " t ", " t ", 't', IronStick, 'x', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(IDaxe, 1), new Object[]{" xx", " tx", " t ", 'x', Items.iron_ingot, 't', IronStick});
		GameRegistry.addRecipe(new ItemStack(IDspade, 1), new Object[]{" x ", " t ", " t ", 't', IronStick, 'x', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(IDsword, 1), new Object[]{" x ", " x ", " t ", 'x', Items.iron_ingot, 't', IronStick});
		
		GameRegistry.addShapelessRecipe(new ItemStack(OHIsword), new Object[]{IDsword, Blocks.obsidian});
		GameRegistry.addShapelessRecipe(new ItemStack(OHIaxe), new Object[]{IDaxe, Blocks.obsidian});
		GameRegistry.addShapelessRecipe(new ItemStack(OHIspade), new Object[]{IDspade, Blocks.obsidian});
		GameRegistry.addShapelessRecipe(new ItemStack(OHIpick), new Object[]{IDpick, Blocks.obsidian});
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(DOHsword), new Object[]{RDsword, Blocks.obsidian});
		GameRegistry.addShapelessRecipe(new ItemStack(DOHaxe), new Object[]{RDaxe, Blocks.obsidian});
		GameRegistry.addShapelessRecipe(new ItemStack(DOHspade), new Object[]{RDspade, Blocks.obsidian});
		GameRegistry.addShapelessRecipe(new ItemStack(DOHpick), new Object[]{RDpick, Blocks.obsidian});
		
		//ITEM CRAFTING

		GameRegistry.addRecipe(new ItemStack(IronStick, 2), new Object[]{"   ", " x ", " x ", 'x', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(treetap, 4), new Object[]{"xxx", "x x", "x  ", 'x', Items.stick});
		GameRegistry.addRecipe(new ItemStack(steeldagger, 1), new Object[]{"   ", " x ", "t  ", 'x', Items.iron_ingot, 't', Items.stick});
		
		GameRegistry.addSmelting(new ItemStack(sORE, 1), new ItemStack(singot, 1), 0.1f);
		
		
		//BLOCK CRAFTING
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(wwalling, 16), new Object[]{marble, Blocks.wool});
		GameRegistry.addShapelessRecipe(new ItemStack(mglass, 6), new Object[]{Blocks.glass, IronStick});
		GameRegistry.addShapelessRecipe(new ItemStack(bbrick, 4), new Object[]{Blocks.brick_block, IronStick});
		GameRegistry.addShapelessRecipe(new ItemStack(pbrick, 4), new Object[]{new ItemStack(Blocks.wool, 1, 10), Blocks.brick_block});
		GameRegistry.addShapelessRecipe(new ItemStack(gbrick, 4), new Object[]{new ItemStack(Blocks.wool, 1, 5), Blocks.brick_block});
		GameRegistry.addShapelessRecipe(new ItemStack(blbrick, 4), new Object[]{new ItemStack(Blocks.wool, 1, 11), Blocks.brick_block});
		GameRegistry.addShapelessRecipe(new ItemStack(mbrick, 4), new Object[]{new ItemStack(Blocks.wool, 1, 2), Blocks.brick_block});
		GameRegistry.addShapelessRecipe(new ItemStack(ybrick, 4), new Object[]{new ItemStack(Blocks.wool, 1, 4), Blocks.brick_block});
		GameRegistry.addShapelessRecipe(new ItemStack(bwood, 4), new Object[]{IronStick, new ItemStack(Blocks.planks, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(swood, 4), new Object[]{new ItemStack(Blocks.planks, 1, 0), new ItemStack(Items.dye, 1, 14)});
		
		//LAMP CRAFTING
		GameRegistry.addShapelessRecipe(new ItemStack(wLAMP, 2), new Object[]{Blocks.wool, Blocks.redstone_lamp});
		GameRegistry.addShapelessRecipe(new ItemStack(rLAMP, 2), new Object[]{new ItemStack(Blocks.wool, 1, 14), wLAMP});
		GameRegistry.addShapelessRecipe(new ItemStack(yLAMP, 2), new Object[]{new ItemStack(Blocks.wool, 1, 4), wLAMP});
		GameRegistry.addShapelessRecipe(new ItemStack(pLAMP, 2), new Object[]{new ItemStack(Blocks.wool, 1, 10), wLAMP});
		GameRegistry.addShapelessRecipe(new ItemStack(mLAMP, 2), new Object[]{new ItemStack(Blocks.wool, 1, 2), wLAMP});
		GameRegistry.addShapelessRecipe(new ItemStack(bLAMP, 2), new Object[]{new ItemStack(Blocks.wool, 1, 11), wLAMP});
		GameRegistry.addShapelessRecipe(new ItemStack(brLAMP, 2), new Object[]{new ItemStack(Blocks.wool, 1, 12), wLAMP});
		GameRegistry.addShapelessRecipe(new ItemStack(gLAMP, 2), new Object[]{new ItemStack(Blocks.wool, 1, 5), wLAMP});
		
		
		
		
		//GENERATION REGISTRATION
		
		GameRegistry.registerWorldGenerator(new WorldGeneratormCore(), 0);
		GameRegistry.registerWorldGenerator(new WorldGeneratorMCORESAPPHIREBLOCK(), 0);
		
		//ITEM REGISTRY
		
		
		GameRegistry.registerItem(IDspade, "IDspade");
		GameRegistry.registerItem(IDsword, "IDsword");
		GameRegistry.registerItem(IDaxe, "IDaxe");
		GameRegistry.registerItem(IDpick, "IDpick");
		
		GameRegistry.registerItem(OHIspade, "OHIspade");
		GameRegistry.registerItem(OHIsword, "OHIsword");
		GameRegistry.registerItem(OHIaxe, "OHIaxe");
		GameRegistry.registerItem(OHIpick, "OHIpick");
		GameRegistry.registerItem(sspade, "sspade");
		GameRegistry.registerItem(ssword, "ssword");
		GameRegistry.registerItem(saxe, "saxe");
		GameRegistry.registerItem(spick, "spick");
		
		
		GameRegistry.registerItem(singot, "singot");
		GameRegistry.registerItem(steeldagger, "steeldagger");
		GameRegistry.registerItem(eggs, "Eggs");
		GameRegistry.registerItem(wheatdonut, "wheatdonut");
		GameRegistry.registerItem(chocdonut, "chocdonut");
		GameRegistry.registerItem(sugdonut, "sugdonut");
		GameRegistry.registerItem(IronStick, "IronStick");
		GameRegistry.registerItem(treetap, "treetap");
		GameRegistry.registerItem(sap, "sap");
		GameRegistry.registerItem(mpancake, "mpancake");
		GameRegistry.registerItem(fsticks, "fsticks");
		GameRegistry.registerItem(icecream, "icecream");
		GameRegistry.registerItem(cheese, "cheese");
		GameRegistry.registerItem(pancake, "pancake");
		GameRegistry.registerItem(syrup, "syrup");
		GameRegistry.registerItem(RDspade, "RDspade");
		GameRegistry.registerItem(RDsword, "RDsword");
		GameRegistry.registerItem(RDpick, "RDpick");
		GameRegistry.registerItem(RDaxe, "RDaxe");
		GameRegistry.registerItem(helmetSapphire, "helmetSapphire");
		GameRegistry.registerItem(legsSapphire, "legsSapphire");
		GameRegistry.registerItem(bootsSapphire, "bootsSapphire");
		GameRegistry.registerItem(chestplateSapphire, "chestplateSapphire");
		GameRegistry.registerItem(DOHpick, "DOHpick");
		GameRegistry.registerItem(DOHaxe, "DOHaxe");
		GameRegistry.registerItem(DOHspade, "DOHspade");
		GameRegistry.registerItem(DOHsword, "DOHsword");
	}
	
	
	
	
	
}

