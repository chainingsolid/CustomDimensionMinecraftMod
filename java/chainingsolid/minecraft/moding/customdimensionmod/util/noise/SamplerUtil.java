package chainingsolid.minecraft.moding.customdimensionmod.util.noise;

public class SamplerUtil {
	
	
	
	
	public static double sampler1D(int worldX, SamplerLayer1D[] layers, double[] weights){
		double value = 0;
		double divideValueBy = 0;
		
		for(int layerIndex = 0; layerIndex < layers.length; layerIndex++){
			value += weights[layerIndex]*layers[layerIndex].sample(worldX);
			divideValueBy += weights[layerIndex];
		}
		
		return value / divideValueBy;
	}
	
	
	
	
	
	
	
	
	
}
