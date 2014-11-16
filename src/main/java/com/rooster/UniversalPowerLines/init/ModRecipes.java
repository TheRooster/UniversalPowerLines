package com.rooster.universalpowerlines.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Jonathan on 11/15/2014.
 */
public class ModRecipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.rubberizedLeatherBoots), new Object[]{"materialRubber", Items.leather_boots}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.rubberizedIronBoots), new Object[]{"materialRubber", Items.iron_boots}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.rubberizedGoldBoots), new Object[]{"materialRubber", Items.golden_boots}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.rubberizedChainBoots), new Object[]{"materialRubber", Items.chainmail_boots}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.rubberizedDiamondBoots), new Object[]{"materialRubber", Items.diamond_boots}));
    }
}
