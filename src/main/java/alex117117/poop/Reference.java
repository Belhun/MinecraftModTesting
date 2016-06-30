package alex117117.poop;

public class Reference {
	public static final String MOD_ID = "AlexPoop";
	public static final String NAME = "Alex's Poop Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_MINECRAFT_VERSIONs = "[1.9.4]";
	
	public static final String CLIENT_PROXY_CLASS = "alex117117.poop.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "alex117117.poop.proxy.ServerProxy";
	
	public static enum Poopitems {
		POOP("poop", "ItemPoop");
		
		private String unlocalizedName;
		private String registryName;
		
		
		Poopitems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
	}
	public static enum BlockPoop {
		Pooppile("poop", "BlockPoop");
		
		private String unlocalizedName;
		private String registryName;
		
		
		BlockPoop(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		
	}
}
