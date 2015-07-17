package simplemod.init;

import simplemod.blocks.BlockSimple;
import simplemod.blocks.DinosaurBlock;
import simplemod.help.RegisterHelper;
import net.minecraft.block.Block;
import simplemod.blocks.Diamonds;

public class ModBlocks {
	public static Block block = new BlockSimple();

	
	public static Block diamonds = new Diamonds();
	public static Block dinosaur = new DinosaurBlock();

	public static void registerBlocks()
	{
		RegisterHelper.registerBlock(block);

		RegisterHelper.registerBlock(diamonds);
		

		RegisterHelper.registerBlock(dinosaur);

	}

	public static void registerMesh()
	{
		RegisterHelper.registerBlockRenderer(block);

		RegisterHelper.registerBlockRenderer(diamonds);

		RegisterHelper.registerBlockRenderer(dinosaur);

	}
}
