package com.cez.mod1.item;

import com.cez.mod1.Mod1;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mod1.MOD_ID);

    public static final RegistryObject<Item> OATMEAL = ITEMS.register("ovazcez",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
