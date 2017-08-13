package chainingsolid.minecraft.moding.customdimensionmod.dimension.util;

import java.util.Random;

public class GenerationUtil {
	
	
	
	public static Random getRandom(long worldSeed, int dimId, int chunkX, int chunkY, int shift){
		Random rand = new Random(worldSeed);
		long rSeed = rand.nextInt();
		
		rand = new Random(dimId);
		long rDim = rand.nextInt();
		
		rand = new Random(chunkX);
		long rX = rand.nextInt();
		
		rand = new Random(chunkY);
		long rY = rand.nextInt();
		
		return rand = new Random(rSeed + rDim + rX + rY + shift);
	}
	
	
	
	
	
}
