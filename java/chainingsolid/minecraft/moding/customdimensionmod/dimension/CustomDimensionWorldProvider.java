package chainingsolid.minecraft.moding.customdimensionmod.dimension;

import chainingsolid.minecraft.moding.customdimensionmod.CustomDimensionMod;
import chainingsolid.minecraft.moding.customdimensionmod.dimension.stagesystem.TemparyStagePipeLineGenerator;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.IChunkGenerator;

public class CustomDimensionWorldProvider extends WorldProvider {
	
	@Override
	public DimensionType getDimensionType() {
		return CustomDimensionMod.MOD_INSTANCE.dimType;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator(){
		return new CustomDimensionChunkGenerator(this, world, TemparyStagePipeLineGenerator.tempPipeLine);//TODO add the set up your own dimetions setting stuff before world gen!
	}
	
}
