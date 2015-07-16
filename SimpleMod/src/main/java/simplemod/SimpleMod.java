package simplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import simplemod.help.Reference;
import simplemod.init.ModBlocks;
import simplemod.init.ModItems;
import simplemod.proxies.CommonProxy;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class SimpleMod {
	
	//random comment
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	@Instance(Reference.MODID)
	public static SimpleMod instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		if(event.getSide() == Side.CLIENT)
		{
			ModItems.registerMesh();
			ModBlocks.registerMesh();
		}
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
	}
	
	public static CreativeTabs tabCustom = new CreativeTabs("simpletab") {
    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return Items.beef;
    }
};
}
