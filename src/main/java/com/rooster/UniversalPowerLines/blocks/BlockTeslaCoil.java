package com.rooster.universalpowerlines.blocks;

import net.minecraft.block.material.Material;

/**
 * Created by Jonathan on 11/16/2014.
 */
public class BlockTeslaCoil extends BlockUPLBase
{

    public BlockTeslaCoil()
    {
        super(Material.iron);
        this.setBlockName("blockTeslaCoil");

    }

    public void onBlockPlaced()
    {
        //check for multiblock
    }
}
