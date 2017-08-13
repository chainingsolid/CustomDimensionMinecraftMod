package chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem;

import chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem.planning.traveltypes.TravelTypePlannoutStage;

public class TemparyStagePipeLineGenerator {
	
	public static GenerationStagePipeline tempPipeLine;
	
	
	public static void createTempPipeline(){
		tempPipeLine = new GenerationStagePipeline();
		tempPipeLine.addStage(0, new TravelTypePlannoutStage());
		tempPipeLine.addStage(1, new TempEndStage());
		
		
	}
	
	
	
	
	
}
