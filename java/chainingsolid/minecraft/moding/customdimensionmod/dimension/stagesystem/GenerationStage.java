package chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem;

import java.util.List;

import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public interface GenerationStage {
	
	public void runStage(
			int chunkBeingGeneratedX,
			int chunkBeingGeneratedY,
			long worldSeed,
			int dimentionId,
			NotesAndCacheSystem<Object> notesAndcachedData
		);
	
	public Chunk getChunk(
			int chunkBeingGeneratedX,
			int chunkBeingGeneratedY,
			long worldSeed,
			int dimentionId,
			NotesAndCacheSystem<Object> notesAndcachedData,
			World world
		);
	
	public String getStageId();
	
	public List<String> getStagesThatMustBeBeforeThisOne();
	
	
	
	
	
}
