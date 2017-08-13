package chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public abstract class BaseGenerationStageImplementation implements GenerationStage {
	
	public List<String> stagesThatMustBePrior = new ArrayList<String>();
	
	@Override
	public Chunk getChunk(int chunkBeingGeneratedX, int chunkBeingGeneratedY, long worldSeed, int dimentionId, NotesAndCacheSystem<Object> notesAndcachedData, World world) {
		return null;
	}
	
	@Override
	public List<String> getStagesThatMustBeBeforeThisOne() {
		return stagesThatMustBePrior;
	}
	
}
