package chainingsolid.minecraft.moding.customdimensionmod.util.noise;

import chainingsolid.minecraft.moding.customdimensionmod.util.Pair;

public abstract class SamplerLayer1D {
	
	public double scaleingX = 1;
	public double[] cellWeights;
	public int shiftCellWeightsInLayerByX;
	
	public SamplerLayer1D(double[] cellWeights, int shiftCellWeightsInLayerByX){
		this.cellWeights = cellWeights;
		this.shiftCellWeightsInLayerByX = shiftCellWeightsInLayerByX;
	}
	
	public abstract double getValue(int worldX);
	
	public double sample(int worldX){
		double value = 0;
		double divideValueBy = 0;
		
		for(int xIndexInWeights = 0; xIndexInWeights < cellWeights.length; xIndexInWeights++){
			int xInWorld = worldX + xIndexInWeights + shiftCellWeightsInLayerByX;
			double weight = cellWeights[xIndexInWeights];
			value += weight*getValue(xInWorld);
			divideValueBy += weight;
		}
		
		return value / divideValueBy;
	}
	
	
	
}
