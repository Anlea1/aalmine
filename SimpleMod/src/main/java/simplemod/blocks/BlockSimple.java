package simplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import simplemod.SimpleMod;

public class BlockSimple extends Block {
	
	public BlockSimple() {
		super(Material.wood);
		setUnlocalizedName("blocksimple"); // Setting the behind the scenes name of the block known as the unlocalized name, used for localization and block model
		setResistance(1.0F); // Setting how resistant this block is to explosions (stone: 10F, obsidian: 2000.0F)
		setHardness(1.0F); // Setting how long it takes to break this block (stone: 1.5F, obsidian: 50.0F)
		setCreativeTab(SimpleMod.tabCustom);
	}
}
