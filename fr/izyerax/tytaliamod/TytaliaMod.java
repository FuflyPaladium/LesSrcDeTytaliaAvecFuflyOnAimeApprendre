/*    */ package fr.izyerax.tytaliamod;
/*    */ 
/*    */ import cpw.mods.fml.common.Loader;
/*    */ import cpw.mods.fml.common.Mod;
/*    */ import cpw.mods.fml.common.Mod.EventHandler;
/*    */ import cpw.mods.fml.common.Mod.Instance;
/*    */ import cpw.mods.fml.common.SidedProxy;
/*    */ import cpw.mods.fml.common.event.FMLInitializationEvent;
/*    */ import cpw.mods.fml.common.event.FMLPreInitializationEvent;
/*    */ import cpw.mods.fml.common.network.NetworkRegistry;
/*    */ import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
/*    */ import cpw.mods.fml.common.registry.GameRegistry;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import fr.izyerax.tytaliamod.utils.ForgeEventHandler;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mod(modid = "tytaliamod", name = "TytaliaMod", version = "0.0.3", acceptedMinecraftVersions = "[1.7.10]")
/*    */ public class TytaliaMod
/*    */   extends TytaliaItems
/*    */ {
/*    */   @Instance("tytaliamod")
/*    */   public static TytaliaMod instance;
/*    */   @SidedProxy(clientSide = "fr.izyerax.tytaliamod.TytaClient", serverSide = "fr.izyerax.tytaliamod.TytaServer")
/*    */   public static TytaCommon common;
/*    */   public static SimpleNetworkWrapper network;
/*    */   public static Logger logger;
/*    */   
/*    */   @EventHandler
/*    */   public void preInit(FMLPreInitializationEvent e) {
/* 38 */     MinecraftForge.EVENT_BUS.register(new ForgeEventHandler());
/*    */     
/* 40 */     network = NetworkRegistry.INSTANCE.newSimpleChannel("EasyUltraLogsChannel");
/* 41 */     network.registerMessage(fr.izyerax.tytaliamod.utils.SendingMod.Handler.class, fr.izyerax.tytaliamod.utils.SendingMod.class, 0, Side.SERVER);
/*    */ 
/*    */     
/* 44 */     GameRegistry.registerItem(this.RECORD_ATTACK_ON_TITAN, "record_attack_on_titan_ost");
/* 45 */     GameRegistry.registerItem(this.RECORD_INTERSTELLAR_MAIN_THEME, "record_interstellar_main_theme");
/* 46 */     GameRegistry.registerItem(this.RECORD_OLD_TOWN_ROAD_LIL_NAS_X, "record_old_town_road_lil_nas_x");
/* 47 */     GameRegistry.registerItem(this.RECORD_ONE_PIECE_OVERTAKEN, "record_one_piece_overtaken");
/* 48 */     GameRegistry.registerItem(this.RECORD_SEPTEMBER, "record_september_meme");
/*    */     
/* 50 */     GameRegistry.registerItem(this.RECORD_TRI_POLOSKI, "record_tri_poloski");
/* 51 */     GameRegistry.registerItem(this.RECORD_TRAVIS_SCOTT_GOOSEBUMPS, "record_travis_scott_goosebumps");
/* 52 */     GameRegistry.registerItem(this.RECORD_TRAVIS_SCOTT_SICKO_MODE, "record_travis_scott_sicko_mode");
/* 53 */     GameRegistry.registerItem(this.RECORD_ALL_STAR_SMASH_MOUSE, "record_all_star_smash_mouse");
/*    */     
/* 55 */     GameRegistry.registerItem(this.RECORD_SUPER_SMASH_BROS, "record_smash_bros_menu");
/* 56 */     GameRegistry.registerItem(this.RECORD_TOBY_FOX_HOPES_AND_DREAMS, "record_toby_fox_hopes_and_dreams");
/*    */     
/* 58 */     GameRegistry.registerItem(this.RECORD_TOBY_FOX_MEGALOVANIA, "record_toby_fox_megalovania");
/* 59 */     GameRegistry.registerItem(this.RECORD_GIORNO_THEME, "record_giorno_theme");
/* 60 */     GameRegistry.registerItem(this.RECORD_RENOIS, "record_renois");
/* 61 */     GameRegistry.registerItem(this.RECORD_CAPTAIN_SPARKLEZ_REVENGE, "record_captain_sparklez_revenge");
/* 62 */     GameRegistry.registerItem(this.RECORD_TRYHARDNINJA_TAKE_BACK_AT_NIGHT, "record_tryhardninja_take_back_at_night");
/* 63 */     GameRegistry.registerItem(this.RECORD_CARLA_BIM_BAM_TOI, "record_carla_bim_bam_toi");
/* 64 */     GameRegistry.registerItem(this.RECORD_HIGE_DRIVER_DADADADADADADADADADA, "record_hige_driver_dadadadadadadadadada");
/* 65 */     GameRegistry.registerItem(this.RECORD_ALAN_WALKER_FADED, "record_alan_walker_faded");
/* 66 */     GameRegistry.registerItem(this.RECORD_ALAN_WALKER_END_OF_TIME, "record_alan_walker_end_of_time");
/* 67 */     GameRegistry.registerItem(this.RECORD_TLT_FNAF1_SONG, "record_tlt_fnaf1_song");
/* 68 */     GameRegistry.registerItem(this.RECORD_TLT_FNAFSL_SONG, "record_tlt_fnafsl_song");
/*    */   }
/*    */   
/* 71 */   public static CreativeTabs tytalia_miscellaneous = new CreativeTabs("tytalia_creative_tabs_miscellaneous")
/*    */     {
/*    */       public Item func_78016_d()
/*    */       {
/* 75 */         return TytaliaMod.instance.RECORD_TOBY_FOX_MEGALOVANIA; }
/*    */     };
/*    */ 
/*    */   
/*    */   @EventHandler
/*    */   public void init(FMLInitializationEvent e) {
/* 81 */     common.init();
/* 82 */     common.registerRenders();
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public String modlist;
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public String getModList() {
/* 90 */     String modlist = Loader.instance().getActiveModList().toString();
/* 91 */     this.modlist = modlist;
/* 92 */     return this.modlist;
/*    */   }
/*    */ }