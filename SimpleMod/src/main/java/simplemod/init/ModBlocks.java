package simplemod.init;

import simplemod.blocks.BlockSimple;
import simplemod.help.RegisterHelper;
import net.minecraft.block.Block;

public class ModBlocks {
	public static Block block = new BlockSimple();

	public static void registerBlocks()
	{
		RegisterHelper.registerBlock(block);
	}

	public static void registerMesh()
	{
		RegisterHelper.registerBlockRenderer(block);
	}
}
