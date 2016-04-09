package yuchan.yuchansmod_ores;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "yuchansmod_ores";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.addSmelting(Items.diamond,
                new ItemStack(Items.gold_ingot, 3),0.1F);
        GameRegistry.addSmelting(Items.gold_ingot,
                new ItemStack(Items.dye, 1),0.1F);
        GameRegistry.addSmelting(Items.dye,
                new ItemStack(Items.quartz, 3),0.1F);
        GameRegistry.addSmelting(Items.quartz,
                new ItemStack(Items.iron_ingot, 1),0.1F);
        GameRegistry.addSmelting(Items.iron_ingot,
                new ItemStack(Items.redstone, 3),0.1F);
        GameRegistry.addSmelting(Items.redstone,
                new ItemStack(Items.coal, 4),0.1F);
        GameRegistry.addSmelting(Blocks.coal_block,
                new ItemStack(Items.redstone, 1),0.1F);
        GameRegistry.addSmelting(Blocks.redstone_block,
                new ItemStack(Items.iron_ingot, 2),0.1F);
        GameRegistry.addSmelting(Blocks.iron_block,
                new ItemStack(Items.quartz, 1),0.1F);
        GameRegistry.addSmelting(Blocks.quartz_block,
                new ItemStack(Items.dye, 1),0.1F);
        GameRegistry.addSmelting(Blocks.lapis_block,
                new ItemStack(Items.gold_ingot, 4),0.1F);
        GameRegistry.addSmelting(Blocks.gold_block,
                new ItemStack(Items.diamond, 2),0.1F);
    }}
