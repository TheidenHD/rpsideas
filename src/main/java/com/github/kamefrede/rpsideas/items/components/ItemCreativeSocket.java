package com.github.kamefrede.rpsideas.items.components;

import com.github.kamefrede.rpsideas.items.base.ItemComponent;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import vazkii.psi.api.cad.EnumCADComponent;
import vazkii.psi.api.cad.EnumCADStat;

import javax.annotation.Nullable;
import java.util.List;

public class ItemCreativeSocket extends ItemComponent {
    @Override
    public EnumCADComponent getComponentType(ItemStack itemStack) {
        return EnumCADComponent.SOCKET;
    }

    @Override
    protected void registerStats() {
        addStat(EnumCADStat.BANDWIDTH, -1);
        addStat(EnumCADStat.SOCKETS, 12);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World world, List<String> tooltip, ITooltipFlag mistake) {
        super.addInformation(stack, world, tooltip, mistake);
    }
}
