package com.rooster.universalpowerlines.creativetab;

import com.rooster.universalpowerlines.init.ModBlocks;
import com.rooster.universalpowerlines.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Jonathan on 11/16/2014.
 */
public class CreativeTabUPL
{
    public static final CreativeTabs UPL_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public String getTranslatedTabLabel()
        {
            return ("Universal Power Lines");
        }

        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(ModBlocks.blockTeslaCoil);
        }
    };
}
