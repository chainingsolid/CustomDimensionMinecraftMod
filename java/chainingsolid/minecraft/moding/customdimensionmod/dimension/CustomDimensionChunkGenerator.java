package chainingsolid.minecraft.moding.customdimensionmod.dimension;

import java.util.List;

import chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem.GenerationStagePipeline;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;

public class CustomDimensionChunkGenerator implements IChunkGenerator {
	
	CustomDimensionWorldProvider worldProvider;
	World world;
	GenerationStagePipeline pipeline;
	
	public CustomDimensionChunkGenerator(CustomDimensionWorldProvider worldProvider, World world, GenerationStagePipeline pipeline){
		this.pipeline = pipeline;
		this.world = world;
		this.pipeline.setSeed_DimIdAndWorld(worldProvider.getSeed(), worldProvider.getDimension(), world);
	}
	
	@Override
	public Chunk generateChunk(int chunkX, int chunkZ) {
		return pipeline.runPipeLine(chunkX, chunkZ);
	}
	
	@Override
	public void populate(int x, int z) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean generateStructures(Chunk chunkIn, int x, int z) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public List<SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
		return world.getBiome(pos).getSpawnableList(creatureType);
	}
	
	@Override
	public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position, boolean findUnexplored) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void recreateStructures(Chunk chunkIn, int x, int z) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos) {
		// TODO Auto-generated method stub
		return false;
	}
	
}








