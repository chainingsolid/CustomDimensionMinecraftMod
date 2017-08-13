package chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.NoiseGeneratorOctaves;


public class TempEndStage extends BaseGenerationStageImplementation{
	
	
	NoiseGeneratorOctaves noise;
	
	@Override
	public void runStage(int chunkBeingGeneratedX, int chunkBeingGeneratedY, long worldSeed, int dimentionId, NotesAndCacheSystem<Object> notesAndcachedData) {
		if(noise == null){
			noise = new NoiseGeneratorOctaves(new Random(worldSeed), 5);
		}
		
		
	}
	
	@Override
	public Chunk getChunk(int chunkBeingGeneratedX, int chunkBeingGeneratedY, long worldSeed, int dimentionId, NotesAndCacheSystem<Object> notesAndcachedData, World world) {
		
		//TODO gen multipe noise layers and try out setting biomes with em, which ever biome has the hightest value is the one placed - if it works uses use for placing terrain travel types
		ChunkPrimer primer = new ChunkPrimer();
		double[] noiseArray = new double[16*16*1];
		noise.generateNoiseOctaves(noiseArray, chunkBeingGeneratedX*16, 0, chunkBeingGeneratedY*16, 16, 1, 16, 0.1, 1, 0.1);
		int i = 0;
		for(int x = 0; x < 16; x++){
			for(int z = 0; z < 16; z++){
				
				int h = (int) (noiseArray[i]*2);
				h += 5;
				i++;
				for(int y = 0; y < h; y++){
					primer.setBlockState(x, y, z, Blocks.DIRT.getDefaultState());
				}
			}
		}
		
		
		
		Chunk chunk = new Chunk(world, primer, chunkBeingGeneratedX, chunkBeingGeneratedY);
		return chunk;
	}
	
	
	
	@Override
	public String getStageId() {
		return "temp";
	}
	
	
	
	
	
}
