package alex117117.poop;
import alex117117.poop.init.ModBlocks;
import alex117117.poop.init.ModItems;
import alex117117.poop.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod( modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSIONs )

public class MainPoop {

	@Instance
	public static MainPoop instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
		System.out.println("PreInit");
		
		ModItems.init();
		ModItems.register();
		System.out.println("BLOCKS!!!!!!!!!!!!");
		ModBlocks.init();
		ModBlocks.register();
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		proxy.init();
	}
	@EventHandler
	public void postinit(FMLPostInitializationEvent event){
		System.out.println("postinit");
	}
}
