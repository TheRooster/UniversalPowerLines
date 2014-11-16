package com.rooster.universalpowerlines.init;

import com.rooster.universalpowerlines.blocks.BlockTeslaCoil;
import com.rooster.universalpowerlines.blocks.BlockUPLBase;
import com.rooster.universalpowerlines.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Jonathan on 11/16/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockUPLBase blockTeslaCoil = new BlockTeslaCoil();


    public static void init()
    {
        GameRegistry.registerBlock(blockTeslaCoil, "blockTeslaCoil");
    }

}
