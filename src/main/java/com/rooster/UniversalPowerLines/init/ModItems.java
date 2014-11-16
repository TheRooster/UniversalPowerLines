package com.rooster.universalpowerlines.init;

import com.rooster.universalpowerlines.items.ItemRubber;
import com.rooster.universalpowerlines.items.ItemRubberizedBoots;
import com.rooster.universalpowerlines.items.ItemUPLBase;
import com.rooster.universalpowerlines.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Jonathan on 11/15/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{

    public static final ItemUPLBase rubber = new ItemRubber();
    public static final ItemRubberizedBoots rubberizedLeatherBoots = (ItemRubberizedBoots) new ItemRubberizedBoots(ItemArmor.ArmorMaterial.CLOTH, 0, 3).setUnlocalizedName("bootsCloth").setTextureName("leather_boots");
    public static final ItemRubberizedBoots rubberizedIronBoots = (ItemRubberizedBoots) new ItemRubberizedBoots(ItemArmor.ArmorMaterial.IRON, 2, 3).setUnlocalizedName("bootsIron").setTextureName("iron_boots");
    public static final ItemRubberizedBoots rubberizedGoldBoots = (ItemRubberizedBoots) new ItemRubberizedBoots(ItemArmor.ArmorMaterial.GOLD, 4, 3).setUnlocalizedName("bootsGold").setTextureName("gold_boots");
    public static final ItemRubberizedBoots rubberizedChainBoots = (ItemRubberizedBoots) new ItemRubberizedBoots(ItemArmor.ArmorMaterial.CHAIN, 1, 3).setUnlocalizedName("bootsChain").setTextureName("chainmail_boots");
    public static final ItemRubberizedBoots rubberizedDiamondBoots = (ItemRubberizedBoots) new ItemRubberizedBoots(ItemArmor.ArmorMaterial.DIAMOND, 3, 3).setUnlocalizedName("bootsDiamond").setTextureName("diamond_boots");

    public static void init()
    {
        GameRegistry.registerItem(rubber, "rubberBall");
        GameRegistry.registerItem(rubberizedLeatherBoots, "bootsLeatherRubberized");
        GameRegistry.registerItem(rubberizedIronBoots, "bootsIronRubberized");
        GameRegistry.registerItem(rubberizedGoldBoots, "bootsGoldRubberized");
        GameRegistry.registerItem(rubberizedChainBoots, "bootsChainRubberized");
        GameRegistry.registerItem(rubberizedDiamondBoots, "bootsDiamondRubberized");

        registerOreDict();
    }

    public static void registerOreDict()
    {
        OreDictionary.registerOre("materialRubber", rubber);
    }
}
