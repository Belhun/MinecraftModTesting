package alex117117.poop.init;

import alex117117.poop.blocks.BlockPoop;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static Block poopypile; 
	
	public static void init() {
		poopypile = new BlockPoop();
		
	}
	public static void register(){
		GameRegistry.register(poopypile);
	}
	public static void registerRenders(){
		registerRender(poopypile);
	}
	
	private static void registerBlock(Block block){
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
		
		
		
	}
	
	private static void registerRender(Block block){
		
		Item item = Item.getItemFromBlock(block);
		/*
		System.out.println(block.getRegistryName() + " OVER HERE AM WHAT YOU ARE LOOKING FOR");
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(block.getIdFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory" ));
		System.out.println(block.getRegistryName() + " OVER HERE AM WHAT YOU ARE LOOKING FOR");
		*/
		
	}
	
}
