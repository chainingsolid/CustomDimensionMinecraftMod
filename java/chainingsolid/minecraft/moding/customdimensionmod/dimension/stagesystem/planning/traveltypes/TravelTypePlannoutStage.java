package chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem.planning.traveltypes;

import java.util.Random;

import chainingsolid.minecraft.moding.customdimensionmod.GlobalVariables;
import chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem.BaseGenerationStageImplementation;
import chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem.NotesAndCacheSystem;
import chainingsolid.minecraft.moding.customdimensionmod.dimension.util.GenerationUtil;
import chainingsolid.minecraft.moding.customdimensionmod.util.UtilMath;

public class TravelTypePlannoutStage extends BaseGenerationStageImplementation {
	
	public static final String TRAVEL_TYPE_PLANNOUT_STAGE_ID = GlobalVariables.MOD_ID+":travel_type_plannout_stage";
	
	public static int travelTypePlannoutSquareSizeInBlocks = 128;
	
	@Override
	public void runStage(int chunkBeingGeneratedX, int chunkBeingGeneratedY, long worldSeed, int dimentionId, NotesAndCacheSystem<Object> notesAndcachedData) {
		int planOutSquareCornerX = UtilMath.cutIntDownToNextLowestMultipleOf(chunkBeingGeneratedX, travelTypePlannoutSquareSizeInBlocks/16);
		int planOutSquareCornerY = UtilMath.cutIntDownToNextLowestMultipleOf(chunkBeingGeneratedY, travelTypePlannoutSquareSizeInBlocks/16);
		String nodeDataStorageKey = getKeyForTravelTypePlanOutSquare(chunkBeingGeneratedX, chunkBeingGeneratedY);
		
		Object data = notesAndcachedData.getData(nodeDataStorageKey);
		if(data != null){
			return;
		}
		
		Random rand = GenerationUtil.getRandom(worldSeed, dimentionId, chunkBeingGeneratedX, chunkBeingGeneratedY, 0);
		TravelTypeNodesForSquare planOutSquare = new TravelTypeNodesForSquare(planOutSquareCornerX, planOutSquareCornerY, travelTypePlannoutSquareSizeInBlocks);
		
		int runs = rand.nextInt(20)+10;
		for(int i = 0; i < runs; i++){
			planOutSquare.addNode(
									(planOutSquareCornerX*16)+(rand.nextDouble()*((double)(travelTypePlannoutSquareSizeInBlocks))),
									(planOutSquareCornerY*16)+(rand.nextDouble()*((double)(travelTypePlannoutSquareSizeInBlocks))),
									rand.nextDouble()*4,
									EnumTravelTypes.getRandomTypeAny(rand)
								);
		}
		
		notesAndcachedData.putDataIntoStore(nodeDataStorageKey, 10, planOutSquare);
		
	}
	
	public static String getKeyForTravelTypePlanOutSquare(int chunkX, int chunkZ){
		int planOutSquareCornerX = UtilMath.cutIntDownToNextLowestMultipleOf(chunkX, travelTypePlannoutSquareSizeInBlocks/16);
		int planOutSquareCornerY = UtilMath.cutIntDownToNextLowestMultipleOf(chunkZ, travelTypePlannoutSquareSizeInBlocks/16);
		String nodeDataStorageKey = "travelTypeNodesFor"+planOutSquareCornerX+":"+planOutSquareCornerY;
		return nodeDataStorageKey;
	}
	
	
	@Override
	public String getStageId() {
		return TRAVEL_TYPE_PLANNOUT_STAGE_ID;
	}
	
	
	
}
