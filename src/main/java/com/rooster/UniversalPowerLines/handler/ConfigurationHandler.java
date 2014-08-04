package com.rooster.UniversalPowerLines.handler;


import com.rooster.UniversalPowerLines.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;

    public static boolean configValue = false;


    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfigs();
        }


    }

    private static void loadConfigs()
    {
        try
        {
            //load config
            configuration.load();
            //read configs
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example").getBoolean(true);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (configuration.hasChanged())
            {
                //save configs
                configuration.save();
            }
        }
    }

    @SubscribeEvent
    public void onConfigurationChanged(ConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfigs();
        }
    }

}
