package alex117117.poop.proxy;

import alex117117.poop.init.ModBlocks;
import alex117117.poop.init.ModItems;

public class ClientProxy implements CommonProxy{
	
	/*@Override
	public void preinit() {
		//ModItems.registerRenders();
		//ModBlocks.registerRenders();
	}*/
	
	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}

}
