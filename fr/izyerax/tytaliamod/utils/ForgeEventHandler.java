/*    */ package fr.izyerax.tytaliamod.utils;
/*    */ 
/*    */ import cpw.mods.fml.common.Loader;
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import fr.izyerax.tytaliamod.TytaliaMod;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraftforge.client.event.ClientChatReceivedEvent;
/*    */ 
/*    */ public class ForgeEventHandler
/*    */ {
/*    */   @SubscribeEvent
/*    */   public void ServerChat(ClientChatReceivedEvent e) {
/* 13 */     if (e.message.func_150254_d().contains("@VERIF")) {
/* 14 */       e.setCanceled(true);
/*    */     }
/* 16 */     if (e.message.func_150254_d().contains("@VERIF -all")) {
/* 17 */       TytaliaMod.network.sendToServer(new SendingMod("(MODULE):@MODLIST - USER: [" + Minecraft.func_71410_x().func_110432_I().func_111285_a() + "] CLIENT MODLIST: " + Loader.instance().getModList()));
/*    */     }
/*    */     
/* 20 */     if (e.message.func_150254_d().contains("@VERIF -" + Minecraft.func_71410_x().func_110432_I().func_111285_a()))
/* 21 */       TytaliaMod.network.sendToServer(new SendingMod("(MODULE):@MODLIST - USER: [" + Minecraft.func_71410_x().func_110432_I().func_111285_a() + "] CLIENT MODLIST: " + Loader.instance().getModList())); 
/*    */   }
/*    */ }
