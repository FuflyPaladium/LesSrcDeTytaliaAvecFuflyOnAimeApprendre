/*     */ package fr.izyerax.tytaliamod.items;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import fr.izyerax.tytaliamod.TytaliaMod;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import net.minecraft.block.BlockJukebox;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.EnumRarity;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemRecord;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.util.StatCollector;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Record
/*     */   extends ItemRecord
/*     */ {
/*  27 */   private static final Map records = new HashMap();
/*     */   
/*     */   public final String field_150929_a;
/*     */   public int textureType;
/*     */   private EnumRarity rarity;
/*     */   
/*     */   public Record(String name, int textureType, EnumRarity rarity) {
/*  34 */     super(name);
/*     */     
/*  36 */     func_77655_b(name);
/*  37 */     this.field_150929_a = name;
/*  38 */     this.textureType = textureType;
/*  39 */     this.rarity = rarity;
/*  40 */     this.field_77777_bU = 1;
/*  41 */     func_77637_a(TytaliaMod.tytalia_miscellaneous);
/*     */     
/*  43 */     records.put(name, this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_77648_a(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
/*  50 */     if (world.func_147439_a(x, y, z) == Blocks.field_150421_aI && world.func_72805_g(x, y, z) == 0) {
/*  51 */       if (world.field_72995_K) {
/*  52 */         return true;
/*     */       }
/*  54 */       ((BlockJukebox)Blocks.field_150421_aI).func_149926_b(world, x, y, z, itemStack);
/*  55 */       world.func_72889_a((EntityPlayer)null, 1005, x, y, z, Item.func_150891_b(this));
/*  56 */       itemStack.field_77994_a--;
/*  57 */       return true;
/*     */     } 
/*     */ 
/*     */     
/*  61 */     return false;
/*     */   }
/*     */ 
/*     */   
/*  65 */   protected int getTextureType() { return this.textureType; }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_94581_a(IIconRegister iconRegister) {
/*  70 */     switch (this.textureType) {
/*     */       case 0:
/*  72 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_blanc");
/*     */         break;
/*     */       
/*     */       case 1:
/*  76 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_cyan");
/*     */         break;
/*     */       
/*     */       case 2:
/*  80 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_gris");
/*     */         break;
/*     */       
/*     */       case 3:
/*  84 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_jaune");
/*     */         break;
/*     */       
/*     */       case 4:
/*  88 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_orange");
/*     */         break;
/*     */       
/*     */       case 5:
/*  92 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_rouge");
/*     */         break;
/*     */       
/*     */       case 6:
/*  96 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_undertale");
/*     */         break;
/*     */       
/*     */       case 7:
/* 100 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_vert_clair");
/*     */         break;
/*     */       
/*     */       case 8:
/* 104 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_vert");
/*     */         break;
/*     */       
/*     */       case 9:
/* 108 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_vert");
/*     */         break;
/*     */       
/*     */       case 10:
/* 112 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_violet");
/*     */         break;
/*     */       
/*     */       case 11:
/* 116 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_carla");
/*     */         break;
/*     */       
/*     */       case 12:
/* 120 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_lol");
/*     */         break;
/*     */       
/*     */       case 13:
/* 124 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_vert_luisant");
/*     */         break;
/*     */       
/*     */       case 14:
/* 128 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_walker");
/*     */         break;
/*     */       
/*     */       case 15:
/* 132 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_driver");
/*     */         break;
/*     */       
/*     */       case 16:
/* 136 */         this.field_77791_bV = iconRegister.func_94245_a("tytaliamod:record_tlt");
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/* 143 */   public void func_77624_a(ItemStack stack, EntityPlayer player, List lore, boolean p_77624_4_) { lore.add(func_150927_i()); }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/* 148 */   public String func_150927_i() { return StatCollector.func_74838_a(func_77658_a() + ".desc"); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 153 */   public EnumRarity func_77613_e(ItemStack itemStack) { return this.rarity; }
/*     */ 
/*     */ 
/*     */   
/* 157 */   public static Record getRecord(String par0Str) { return (Record)records.get(par0Str); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 162 */   public ResourceLocation getRecordResource(String name) { return new ResourceLocation("tytaliamod", name); }
/*     */ }