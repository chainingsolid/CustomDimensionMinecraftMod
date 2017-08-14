package chainingsolid.minecraft.moding.customdimensionmod.util.noise;

import java.util.Random;

public class NoiseUtil {
	
	private static Random preallocatedRand = new Random();
	
	public static double noisePoint1D(int seed, int point){
		preallocatedRand.setSeed((long)point << 32 | seed & 0xFFFFFFFFL);
		return preallocatedRand.nextDouble();
	}
	
	public static double noisePoint2D(int seed, int pointX, int pointY){
		preallocatedRand.setSeed(seed | ((long)pointX << 32 | pointY & 0xFFFFFFFFL));
		return preallocatedRand.nextDouble();
	}
	
	
	
	
}
