package com.rooster.universalpowerlines;

import com.rooster.universalpowerlines.handler.ConfigurationHandler;
import com.rooster.universalpowerlines.init.ModBlocks;
import com.rooster.universalpowerlines.init.ModItems;
import com.rooster.universalpowerlines.init.ModRecipes;
import com.rooster.universalpowerlines.proxy.IProxy;
import com.rooster.universalpowerlines.reference.Reference;
import com.rooster.universalpowerlines.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class UniversalPowerLines
{
    @Mod.Instance(Reference.MOD_ID)
    public static UniversalPowerLines instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();
        LogHelper.info("Pre-Init Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModRecipes.init();
        LogHelper.info("Init Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-Init Complete");
    }
}
