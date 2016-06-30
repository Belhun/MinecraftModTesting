package alex117117.poop.init;

import alex117117.poop.Reference;
import alex117117.poop.items.ItemPoop;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item poop;
	
	public static void init() {
		
		poop = new ItemPoop();
	}
	public static void register(){
		GameRegistry.register(poop);
	}
	public static void registerRenders(){
		registerRender(poop);
	}
	
	private static void registerRender(Item item){
		System.out.println(new ModelResourceLocation(item.getRegistryName(), "inventory" ) + "LOOOOOOOOOOOOOOOK at me");
		ModelLoader.setCustomModelResourceLocation(item, 0,new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
		
	}
	
}
