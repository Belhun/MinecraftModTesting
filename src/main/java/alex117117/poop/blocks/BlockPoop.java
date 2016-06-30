package alex117117.poop.blocks;

import alex117117.poop.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPoop extends Block {

	public BlockPoop() {
		super(Material.CLAY);
		setUnlocalizedName(alex117117.poop.Reference.BlockPoop.Pooppile.getUnlocalizedName());
		setRegistryName(alex117117.poop.Reference.BlockPoop.Pooppile.getRegistryName());
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.getBlockState();
		
	}

	

}
