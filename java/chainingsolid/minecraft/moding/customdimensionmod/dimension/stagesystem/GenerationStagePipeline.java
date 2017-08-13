package chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem;

import java.util.ArrayList;

import chainingsolid.minecraft.moding.customdimensionmod.util.Pair;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class GenerationStagePipeline {
	
	
	public ArrayList<GenerationStage> stages = new ArrayList<GenerationStage>();
	public long worldSeed;
	public int dimentionId;
	public NotesAndCacheSystem<Object> notesAndCachedData = new NotesAndCacheSystem<Object>();
	public World world;
	
	public void setSeed_DimIdAndWorld(long seed, int dimId, World world){
		worldSeed = seed;
		dimentionId = dimId;
		this.world = world;
	}
	
	public Chunk runPipeLine(int chunkBeingGeneratedX, int chunkBeingGeneratedY){
		for(int i = 0; i< stages.size(); i++){
			stages.get(i).runStage(chunkBeingGeneratedX, chunkBeingGeneratedY, worldSeed, dimentionId, notesAndCachedData);
		}
		Chunk chunk = stages.get(stages.size()-1).getChunk(chunkBeingGeneratedX, chunkBeingGeneratedY, worldSeed, dimentionId, notesAndCachedData, world);
		chunk.generateSkylightMap();
		return chunk;
	}
	
	public Pair<Boolean, String> addStage(int spotInStageList, GenerationStage stage){
		Pair<Boolean, String> errorMessage = new Pair(false, "");
		
		stages.add(spotInStageList, stage);
		
		return errorMessage;
	}
	
	
	
	
	
	
	
}
