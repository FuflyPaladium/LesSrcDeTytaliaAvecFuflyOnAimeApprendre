/*    */ package fr.izyerax.tytaliamod.utils;
/*    */ 
/*    */ import cpw.mods.fml.common.network.ByteBufUtils;
/*    */ import cpw.mods.fml.common.network.simpleimpl.IMessage;
/*    */ import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
/*    */ import cpw.mods.fml.common.network.simpleimpl.MessageContext;
/*    */ import io.netty.buffer.ByteBuf;
/*    */ 
/*    */ public class SendingMod
/*    */   implements IMessage
/*    */ {
/*    */   private String text;
/*    */   
/*    */   public SendingMod() {}
/*    */   
/* 16 */   public SendingMod(String text) { this.text = text; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 21 */   public void fromBytes(ByteBuf buf) { this.text = ByteBufUtils.readUTF8String(buf); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 27 */   public void toBytes(ByteBuf buf) { ByteBufUtils.writeUTF8String(buf, this.text); }
/*    */ 
/*    */   
/*    */   public static class Handler
/*    */     extends Object
/*    */     implements IMessageHandler<SendingMod, IMessage>
/*    */   {
/*    */     public IMessage onMessage(SendingMod message, MessageContext ctx) {
/* 35 */       System.out.println(String.format("| %s", new Object[] { SendingMod.access$000(message), (ctx.getServerHandler()).field_147369_b.getDisplayName() }));
/* 36 */       return null;
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 42 */   public String getText() { return this.text; }
/*    */ 
/*    */ 
/*    */   
/* 46 */   public void setText(String text) { this.text = text; }
/*    */ }

