/*    */ package fr.izyerax.tytaliamod;
/*    */ 
/*    */ import java.io.File;
/*    */ 
/*    */ 
/*    */ public class TytaClient
/*    */   extends TytaCommon
/*    */ {
/*  9 */   public void preInit(File configFile) { super.preInit(configFile); }
/*    */ 
/*    */ 
/*    */   
/*    */   public void registerRenders() {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void init() {
/* 18 */     super.init();
/* 19 */     TytaliaMod.instance.getModList();
/*    */   }
/*    */ }

