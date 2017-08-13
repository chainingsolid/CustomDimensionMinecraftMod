package chainingsolid.minecraft.moding.customdimensionmod;

import chainingsolid.minecraft.moding.customdimensionmod.commands.TeleportationCommand;
import chainingsolid.minecraft.moding.customdimensionmod.dimension.CustomDimensionWorldProvider;
import chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem.TemparyStagePipeLineGenerator;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = GlobalVariables.MOD_ID, version = GlobalVariables.MOD_VERSION)
public class CustomDimensionMod {
	
	
	@Instance
	public static CustomDimensionMod MOD_INSTANCE;
	
	public DimensionType dimType;
	public int dimensionId;
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preInit){
		
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent init){
		dimensionId = DimensionManager.getNextFreeDimId();
		FMLLog.log.info("custom dim mod got dim id: "+dimensionId);
		dimType = DimensionType.register("dimName", "suffix", dimensionId, CustomDimensionWorldProvider.class, false);
		DimensionManager.registerDimension(dimensionId, dimType);
		
		TemparyStagePipeLineGenerator.createTempPipeline();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent postInit){
		
		
	}
	
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event){
		event.registerServerCommand(new TeleportationCommand());
	}
	
}







