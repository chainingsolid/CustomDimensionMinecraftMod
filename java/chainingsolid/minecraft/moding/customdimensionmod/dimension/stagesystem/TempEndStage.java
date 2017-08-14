package chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem;

import java.util.Random;

import com.sun.rowset.WebRowSetImpl;

import chainingsolid.minecraft.moding.customdimensionmod.util.noise.NoiseUtil;
import chainingsolid.minecraft.moding.customdimensionmod.util.noise.SamplerLayer1DNoise;
import chainingsolid.minecraft.moding.customdimensionmod.util.noise.SamplerUtil;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.NoiseGeneratorOctaves;


public class TempEndStage extends BaseGenerationStageImplementation{
	
	
	boolean initalized = false;
	SamplerLayer1DNoise[] layers;
	double[] weightsPerLayer;
	
	@Override
	public void runStage(int chunkBeingGeneratedX, int chunkBeingGeneratedY, long worldSeed, int dimentionId, NotesAndCacheSystem<Object> notesAndcachedData) {
		if(!initalized){
			
			double[] weights = new double[]{1,1,1,1,1,1,4,1,1,1,1,1,1};
			SamplerLayer1DNoise layer;
			layer = new SamplerLayer1DNoise(weights, (weights.length/2)*-1, worldSeed);
			layer.scaleingX = 0.7;
			weights = new double[]{1,1,1,2,1,1,1};
			SamplerLayer1DNoise layerBig;
			layerBig = new SamplerLayer1DNoise(weights, (weights.length/2)*-1, worldSeed);
			layerBig.scaleingX = 0.01;
			
			layers = new SamplerLayer1DNoise[]{layer,layerBig};
			weightsPerLayer = new double[]{0.1D,1.0D};
			
			initalized = true;
			
		}
	}
	
	
	
	@Override
	public Chunk getChunk(int chunkBeingGeneratedX, int chunkBeingGeneratedY, long worldSeed, int dimentionId, NotesAndCacheSystem<Object> notesAndcachedData, World world) {
		
		ChunkPrimer primer = new ChunkPrimer();
		for(int x = 0; x < 16; x++){
			double h = SamplerUtil.sampler1D((chunkBeingGeneratedX*16)+x, layers, weightsPerLayer);
			int height = (int) (30D*h);
			for(int z = 0; z < 16; z++){
				for(int y = 0; y < height; y++){
					primer.setBlockState(x, y, z, Blocks.STONE.getDefaultState());
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
