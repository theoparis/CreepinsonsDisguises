package me.creepinson.handler;

import me.creepinson.core.CreepzDisguises;
import me.creepinson.lib.proxy.ClientProxy;
import me.creepinson.lib.util.render.RenderHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class KeysHandler {
	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onEvent(KeyInputEvent event)
	{
	EntityPlayer player	= Minecraft.getMinecraft().thePlayer;
	 
	    KeyBinding[] keyBindings = ClientProxy.keyBindings;
	   
	
if (keyBindings[0].isPressed()) 
{
player.openGui(CreepzDisguises.instance, GuiHandler.MOMO, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
}

	}
}