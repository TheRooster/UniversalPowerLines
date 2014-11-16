package com.rooster.universalpowerlines.items;

import com.rooster.universalpowerlines.creativetab.CreativeTabUPL;
import com.rooster.universalpowerlines.reference.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by Jonathan on 11/15/2014.
 */
public class ItemRubberizedBoots extends ItemArmor
{


    public ItemRubberizedBoots(ArmorMaterial material, int p_i45325_2_, int type)
    {
        super(material, p_i45325_2_, type);
        this.setCreativeTab(CreativeTabUPL.UPL_TAB);
    }


    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s:%sRubberized", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s:%sRubberized", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public void onCreated(ItemStack itemStack, World world, EntityPlayer player)
    {
        itemStack.addEnchantment(Enchantment.featherFalling, 1);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {

        if (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(this))
        { player.addPotionEffect(new PotionEffect(Potion.jump.id, 20)); }
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf('.') + 1);
    }


}
