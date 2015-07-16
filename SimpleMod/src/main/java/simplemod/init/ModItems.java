package simplemod.init;

import simplemod.help.RegisterHelper;
import simplemod.items.ItemSimple;
import net.minecraft.item.Item;

public class ModItems {
	
	public static Item item = new ItemSimple();

	public static void registerItems() {
		RegisterHelper.registerItem(item);
	}
	
	public static void registerMesh() {
		RegisterHelper.registerItemRenderer(item);
	}
}
