package chainingsolid.minecraft.moding.customdimensionmod.util.noise;

public class SamplerLayer1DNoise extends SamplerLayer1D {
	
	
	public long seed;
	
	public SamplerLayer1DNoise(double[] cellWeights, int shiftCellWeightsInLayerByX, long seed) {
		super(cellWeights, shiftCellWeightsInLayerByX);
		this.seed = seed;
	}
	
	@Override
	public double getValue(int worldX) {
		int shiftedX = (int) (worldX*scaleingX);
		return NoiseUtil.noisePoint1D((int) seed, shiftedX);
	}
	
}
