package com.creeping_creeper.autoticfish.mixins;

import ml.northwestwind.forgeautofish.handler.AutoFishHandler;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import slimeknights.tconstruct.library.tools.item.IModifiableDisplay;
import slimeknights.tconstruct.library.tools.nbt.ToolStack;
import slimeknights.tconstruct.tools.data.ModifierIds;

@Mixin({AutoFishHandler.class})
public class AutoFishHandlerMixin {
    @Redirect( method = "findHandOfRod", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;getItem()Lnet/minecraft/world/item/Item;"))
    private static net.minecraft.world.item.Item getItem(ItemStack stack) {
        return stack.getItem() instanceof IModifiableDisplay && ToolStack.from(stack).getModifierLevel(ModifierIds.fishing) > 0 ? Items.FISHING_ROD : stack.getItem();
    }
}
